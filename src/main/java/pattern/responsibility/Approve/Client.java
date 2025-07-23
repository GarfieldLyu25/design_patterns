package pattern.responsibility.Approve;

public class Client {
    public static void main(String[] args) {
        // 构建责任链：Employee -> Manager -> Director
        Approver employee = new Employee();
        Approver manager = new Manager();
        Approver director = new Director();
        employee.setNextApprover(manager);
        manager.setNextApprover(director);

        // 创建采购请求
        PurchaseRequest request1 = new PurchaseRequest(1, 800, "办公用品");
        PurchaseRequest request2 = new PurchaseRequest(2, 4500, "会议设备");
        PurchaseRequest request3 = new PurchaseRequest(3, 12000, "服务器");

        // 提交请求（从链首开始处理）
        employee.processRequest(request1);  // 员工审批
        employee.processRequest(request2);  // 经理审批
        employee.processRequest(request3);  // 总监转董事会
    }
}
