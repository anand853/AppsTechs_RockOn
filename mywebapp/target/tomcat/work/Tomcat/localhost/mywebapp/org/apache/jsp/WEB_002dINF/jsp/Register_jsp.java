/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-03-05 21:19:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <script type=\"text/javascript\"  src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.validate.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">         \r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background-image: url(\"./img/nyc.jpg\");\r\n");
      out.write("}\r\n");
      out.write("label.error {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: red; \r\n");
      out.write("\tbackground: url(\"./img/error.png\") center center no-repeat;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\ttext-indent: -9999px;\r\n");
      out.write("}\r\n");
      out.write("label.valid {\r\n");
      out.write("\twidth: 24px;\r\n");
      out.write("\theight: 24px;\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("\tbackground: url(\"./img/valid.png\") center center no-repeat;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\ttext-indent: -9999px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(".controls{padding: 10px;}\r\n");
      out.write("\r\n");
      out.write("#bolo\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("margin-right:100px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#hello\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("margin-right:170px;\r\n");
      out.write("}\r\n");
      out.write("</style> \r\n");
      out.write("    <title>User Login.</title>\r\n");
      out.write("    </head>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <body>\r\n");
      out.write("        <h4>Login Form</h4>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("   <div class=\"container-fluid\">\r\n");
      out.write("         <div class=\"row-fluid\">\r\n");
      out.write("         <div class=\"span12\">\r\n");
      out.write("         </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"row-fluid\">\r\n");
      out.write("         <div class=\"span6 offset6\">\r\n");
      out.write("         <div id=\"maincontent\" class=\"span8\">\r\n");
      out.write("         \t\t\t\t<fieldset>\r\n");
      out.write("          \r\n");
      out.write("         <form method=\"post\" commandName=\"update\" name=\"myForm\"\r\n");
      out.write("              id=\"registration_form\" class=\"form-horizontal\" action=\"\">\r\n");
      out.write("         <div class=\"control-group\">\r\n");
      out.write("         <label class=\"control-label\">Account number:</label>\r\n");
      out.write("         <div class=\"controls\">\r\n");
      out.write("         <input type=\"text\" class=\"input-xlarge\" name=\"accountnum\" />\r\n");
      out.write("         </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\">Pin</label>\r\n");
      out.write("         <div class=\"controls\">\r\n");
      out.write("         <input type=\"password\" class=\"input-xlarge\" name=\"pin\" />\r\n");
      out.write("         </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("          <div class=\"control-group\">\r\n");
      out.write("          <label class=\"control-label\">deposit</label>\r\n");
      out.write("         <div class=\"controls\">\r\n");
      out.write("         <input type=\"text\" class=\"input-xlarge\" name=\"balance\" />\r\n");
      out.write("         </div>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         <div class=\"form-actions\">\r\n");
      out.write("        \r\n");
      out.write("        <button type=\"submit\"  id=\"hello\" class=\"btn btn-primary btn-large\">\r\n");
      out.write("         submit\r\n");
      out.write("       </button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      </fieldset>\r\n");
      out.write("      <div>\r\n");
      out.write("        <div style=\"color:green\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${welcome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("<div style=\"color:green\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("       <script src=\"./js/jquery-1.7.1.min.js\"></script> \r\n");
      out.write(" \r\n");
      out.write("       <script src=\"./js/jquery.validate.js\"></script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("addEventListener('load', prettyPrint, false);\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\r\n");
      out.write("    $('pre').addClass('prettyprint linenums');\r\n");
      out.write("\r\n");
      out.write("     });\r\n");
      out.write("     \r\n");
      out.write(" </script> \t\t\r\n");
      out.write("\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("     $(document).ready(function(){\r\n");
      out.write("     $('#registration_form').validate({\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t $.validator.addMethod(\r\n");
      out.write("    \t\t\t    \"regex\",\r\n");
      out.write("    \t\t\t    function(value, element, regexp) {\r\n");
      out.write("    \t\t\t        var check = false;\r\n");
      out.write("    \t\t\t        return this.optional(element) || regexp.test(value);\r\n");
      out.write("    \t\t\t    },\r\n");
      out.write("    \t\t\t    \"Please check your input.\"\r\n");
      out.write("    \t\t\t);\r\n");
      out.write("\r\n");
      out.write("    \t \r\n");
      out.write("           rules:{\r\n");
      out.write("               \r\n");
      out.write("                  email:\r\n");
      out.write("                      {\r\n");
      out.write("\r\n");
      out.write("                \t  required:true,\r\n");
      out.write("                \t  regex: /^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}$/\r\n");
      out.write("                      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          \t \r\n");
      out.write("    \t           accountnum: {\r\n");
      out.write("\t                              required: true,\r\n");
      out.write("\t                              required: true,\r\n");
      out.write("\t                              minlength: 6\r\n");
      out.write("\t                          },\r\n");
      out.write("\t                    pin: {\r\n");
      out.write("\t\t        required: true,\r\n");
      out.write("\t\t       required: true,\r\n");
      out.write("\t\t       minlength: 6\r\n");
      out.write("\t\t      }\r\n");
      out.write("\r\n");
      out.write("\t            \t\t      phone:\r\n");
      out.write("\t\t            \t\t      {\r\n");
      out.write("\t\t            \t\t      required:true\r\n");
      out.write("\t\t            \t\t      }\r\n");
      out.write("\t    \r\n");
      out.write("\t\t  \r\n");
      out.write("\t    },\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\thighlight: function(element) {\r\n");
      out.write("\t\t\t$(element).closest('.control-group').removeClass('success').addClass('error');\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsuccess: function(element) {\r\n");
      out.write("\t\t\telement\r\n");
      out.write("\t\t\t.text('OK!').addClass('valid')\r\n");
      out.write("\t\t\t.closest('.control-group').removeClass('error').addClass('success');\r\n");
      out.write("\t\t}\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("}); \r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}