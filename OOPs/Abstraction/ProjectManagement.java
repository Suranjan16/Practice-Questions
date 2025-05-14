public class ProjectManagement {
    public static void main(String[] args) {
        ProjectManager pm;
        pm = new AgileManager();
        manageWork(pm);
        pm = new WaterfallManeger();
        manageWork(pm);
    }

    static void manageWork(ProjectManager p) {
        p.manageProject();
        p.scheduleTasks();
    }
}

abstract class ProjectManager {
    abstract void manageProject();
    abstract void scheduleTasks();
} 

class AgileManager extends ProjectManager {
    @Override
    void manageProject() {
        System.out.println("Managing project using Agile methodologies ........");
    }
    @Override
    void scheduleTasks() {
        System.out.println("Schedule tasks based on sprints.......");
    }
}

class WaterfallManeger extends ProjectManager {
    @Override
    void manageProject() {
        System.out.println("Managing project using Waterfall Methodologies..........");
    }
    @Override
    void scheduleTasks() {
        System.out.println("Schedule tasks in a sequential phase...............");
    }
}