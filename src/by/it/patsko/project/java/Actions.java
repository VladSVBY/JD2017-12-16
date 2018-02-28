package by.it.patsko.project.java;

import by.it.patsko.project.java.commands.*;

public enum Actions {
    LOGIN {
        {
            this.command = new CommandLogIn();
            this.jsp="/login.jsp";
        }
    },LOGOUT{
        {
            this.command = new CommandLogOut();
            this.jsp="/logout.jsp";        }
    },ERROR{
        {
            this.command = new CommandError();
            this.jsp="/error.jsp";
        }
    },SIGNUP{
        {
            this.command = new CommandSignUP();
            this.jsp="/signup.jsp";
        }
    },CATALOG{
        {
            this.command = new CommandCatalog();
            this.jsp="/catalog.jsp";
        }
    },INITDB{
        {
            this.command = new CommandInitDB();
            this.jsp="/initdb.jsp";
        }
    },RESETDB{
        {
            this.command = new CommandResetDB();
            this.jsp="/resetdb.jsp";
        }
    },PROFILE{
        {
            this.command = new CommandProfile();
            this.jsp="/profile.jsp";
        }
    },CHANGELOGIN{
        {
            this.command = new CommandChangeLogin();
            this.jsp="/profile.jsp";
        }
    };

    public String jsp="/error.jsp";
    public ActionCommand command;

    public ActionCommand getCommand() {
        return command;
    }
}
