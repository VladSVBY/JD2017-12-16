package by.it.vshelukhin.jd03_05.java;

import javax.servlet.http.HttpServletRequest;

public class CommandLogout extends Action {
    @Override
    public Action execute(HttpServletRequest request) {
        request.getSession().invalidate();
        request.setAttribute(Msg.MESSAGE, "Вы вышли");
        return Actions.LOGOUT.actionCommand;
    }
}
