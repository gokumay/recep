<%@ page import="javax.servlet.jsp.JspWriter" %>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ page import="java.io.PrintWriter" %>
<%!
    public class visitorForm {
        private PageContext pageContext;
        private JspWriter out;

        public visitorForm(PageContext pageContext) {
            this.pageContext = pageContext;
            out = pageContext.getOut();
        }

        public void run() {
            try {
                parseParameters();
                execute();
                printContent();
            } catch (Exception e) {
                printException(e);
            }
        }

        protected void parseParameters() throws Exception {
            print("visitorForm parseParameters");
        }

        protected void execute() throws Exception {
            print("visitorForm execute");
        }

        protected void printContent() {
            print("visitorForm printContent");
        }

        private void print(Object obj) {
            try {
                out.print(obj);
                out.print("<br/>");
            } catch (Exception ignored) {
            }
        }

        private void printException(Throwable obj) {
            try {
                out.print("<pre>");
                obj.printStackTrace(new PrintWriter(out));
                out.print("</pre>");
                out.print("<br/>");
            } catch (Exception ignored) {
            }
        }
    }
%>
<%
    new visitorForm(pageContext).run();
%>