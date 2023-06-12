package Practical5;
/*
Файл Main
 */
import Practical5.controllers.UserController;
import Practical5.model.FileOperation;
import Practical5.model.FileOperationImpl;
import Practical5.model.Repository;
import Practical5.model.RepositoryFile;
import Practical5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
