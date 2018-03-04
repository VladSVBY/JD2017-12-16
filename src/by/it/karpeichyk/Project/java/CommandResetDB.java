package by.it.karpeichyk.Project.java;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * Created by user on 02.03.2018.
 */
public class CommandResetDB implements  ActionCommand {
    @Override
    public  String execute (HttpServletRequest req) throws SQLException, ClassNotFoundException{
        if (FormUtil.isPost(req)){
            req.setAttribute(Msg.MESSAGE,"POST1. Сброс базы. Если завершается здесь, то возможно вы не скопировали библиотеку mysql-connector-java.jar в lib-local");
ResetDB_karpeychik.main(null);
req.setAttribute(Msg.MESSAGE,"POST2. Сброс базы завершился успешно.");
        }
        return  Action.RESETDB.jsp;
    }
}
