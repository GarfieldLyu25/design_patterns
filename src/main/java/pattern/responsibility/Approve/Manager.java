package pattern.responsibility.Approve;

public class Manager extends Approver{
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("经理审批采购单 #" + request.getId() + "，金额：" + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);  // 传递给下一级
        }
    }
}
