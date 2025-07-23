package pattern.responsibility.Approve;

public class Director extends Approver{

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("总监审批采购单 #" + request.getId() + "，金额：" + request.getAmount());
        } else {
            System.out.println("采购单 #" + request.getId() + " 需要董事会审批！");
        }
    }
}
