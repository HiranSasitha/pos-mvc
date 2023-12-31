/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.contoller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;
import pos.mvc.model.OrderDetailsModel;
import pos.mvc.model.OrderModel;
import java.sql.PreparedStatement;

/**
 *
 * @author Hiran
 */
public class OrderController {

    public String placeOrder(OrderModel model, ArrayList<OrderDetailsModel> orderDetailModels) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            String orderQuery = "INSERT INTO orders VALUES (?,?,?)";

            PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
            statementForOrder.setString(1, model.getOrdeId());
            statementForOrder.setString(2, model.getOrderDate());
            statementForOrder.setString(3, model.getCustId());

            if (statementForOrder.executeUpdate() > 0) {

                boolean isOrderDetailsSaved = true;
                String orderDetailQuery = "INSERT INTO orderdetail VALUES (?,?,?,?)";

                for (OrderDetailsModel orderDetailModel : orderDetailModels) {
                    PreparedStatement statementForOrderDetail = connection.prepareStatement(orderDetailQuery);
                    statementForOrderDetail.setString(1, model.getOrdeId());
                    statementForOrderDetail.setString(2, orderDetailModel.getItemCode());
                    statementForOrderDetail.setInt(3, orderDetailModel.getQty());
                    statementForOrderDetail.setDouble(4, orderDetailModel.getDiscount());

                    if (!(statementForOrderDetail.executeUpdate() > 0)) {
                        isOrderDetailsSaved = false;
                    }
                }

                if (isOrderDetailsSaved) {
                    boolean isItemUpdated = true;
                    String itemQuery = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";

                    for (OrderDetailsModel orderDetailModel : orderDetailModels) {
                        PreparedStatement statementForItem = connection.prepareStatement(itemQuery);

                        statementForItem.setInt(1, orderDetailModel.getQty());
                        statementForItem.setString(2, orderDetailModel.getItemCode());

                        if (!(statementForItem.executeUpdate() > 0)) {
                            isItemUpdated = false;
                        }
                    }
                    
                    if(isItemUpdated){
                        connection.commit();
                        return "Success";
                    } else{
                        connection.rollback();
                        return "Item Save Error";
                    }
                    
                } else {
                    connection.rollback();
                    return "Order Detail Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }
        
    }

}