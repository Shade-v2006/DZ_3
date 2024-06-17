package DZ.DZ_3.view;

import java.util.List;
import java.util.logging.Logger;

import DZ.DZ_3.data.Student;
import DZ.DZ_3.data.StudentGroup;
import DZ.DZ_3.data.User;

public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
