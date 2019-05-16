package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewAllPosts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!-- \n");
      out.write("Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template\n");
      out.write("Author: Hencework\n");
      out.write("Contact: https://hencework.ticksy.com/\n");
      out.write("\n");
      out.write("License: You must have a valid license purchased only from templatemonster to legally use the template for your project.\n");
      out.write("-->\n");
      Register.DbSeaarch dbSearch = null;
      synchronized (session) {
        dbSearch = (Register.DbSeaarch) _jspx_page_context.getAttribute("dbSearch", PageContext.SESSION_SCOPE);
        if (dbSearch == null){
          dbSearch = new Register.DbSeaarch();
          _jspx_page_context.setAttribute("dbSearch", dbSearch, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("    <title>Unifirst | View Post</title>\n");
      out.write("    <meta name=\"description\" content=\"A responsive bootstrap 4 admin dashboard template by hencework\" />\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("    <link rel=\"icon\" href=\"dist/img/graduation.ico\" type=\"image/x-icon\">\n");
      out.write("\t\n");
      out.write("\t<!-- Morris Charts CSS -->\n");
      out.write("    <link href=\"vendors/morris.js/morris.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\n");
      out.write("    <!-- Toggles CSS -->\n");
      out.write("    <link href=\"vendors/jquery-toggles/css/toggles.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"vendors/jquery-toggles/css/themes/toggles-light.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("\t<!-- Toastr CSS -->\n");
      out.write("    <link href=\"vendors/jquery-toast-plugin/dist/jquery.toast.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("    \t<!-- Bootstrap Dropzone CSS -->\n");
      out.write("\t<link href=\"vendors/dropify/dist/css/dropify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"dist/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("     ");
 if(session.getAttribute("role").equals("University")){
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UniversityHeader.jsp", out, false);
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    \n");
      out.write("    ");
 if(session.getAttribute("role").equals("Company")){
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "CompanyHeader.jsp", out, false);
      out.write("\n");
      out.write("    ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Main Content -->\n");
      out.write("        <div class=\"hk-pg-wrapper\">\n");
      out.write("\t\t\t<!-- Container -->\n");
      out.write("            <div class=\"container mt-xl-50 mt-sm-30 mt-15\">\n");
      out.write("                \n");
      out.write("               ");
 if(null!=request.getAttribute("PostDeleteMessage")){ 
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">\n");
      out.write("                             ");
 out.println(request.getAttribute("PostDeleteMessage")); 
      out.write("\n");
      out.write("                        </div>            \n");
      out.write("                     ");
}
      out.write("  \n");
      out.write("                     \n");
      out.write("                     ");
 if(null!=request.getAttribute("postUpdateSucessMessage")){ 
      out.write("\n");
      out.write("                        <div class=\"alert alert-dark  \">\n");
      out.write("                             ");
 out.println(request.getAttribute("postUpdateSucessMessage")); 
      out.write("\n");
      out.write("                        </div>            \n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("             \n");
      out.write("                \n");
      out.write("                \n");
      out.write("         \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- /Container -->\n");
      out.write("\t\t\t\n");
      out.write("            <!-- Footer -->\n");
      out.write("            \n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("<!--            <div class=\"hk-footer-wrap container\">\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                            <p>Pampered by<a href=\"https://hencework.com/\" class=\"text-dark\" target=\"_blank\">Hencework</a> © 2019</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                            <p class=\"d-inline-block\">Follow us</p>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-facebook\"></i></span></a>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-twitter\"></i></span></a>\n");
      out.write("                            <a href=\"#\" class=\"d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4\"><span class=\"btn-icon-wrap\"><i class=\"fa fa-google-plus\"></i></span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>-->\n");
      out.write("            <!-- /Footer -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /Main Content -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /HK Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"vendors/popper.js/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Slimscroll JavaScript -->\n");
      out.write("    <script src=\"dist/js/jquery.slimscroll.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Fancy Dropdown JS -->\n");
      out.write("    <script src=\"dist/js/dropdown-bootstrap-extended.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- FeatherIcons JavaScript -->\n");
      out.write("    <script src=\"dist/js/feather.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Toggles JavaScript -->\n");
      out.write("    <script src=\"vendors/jquery-toggles/toggles.min.js\"></script>\n");
      out.write("    <script src=\"dist/js/toggle-data.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Toastr JS -->\n");
      out.write("    <!--<script src=\"vendors/jquery-toast-plugin/dist/jquery.toast.min.js\"></script>-->\n");
      out.write("    \n");
      out.write("\t<!-- Counter Animation JavaScript -->\n");
      out.write("\t<script src=\"vendors/waypoints/lib/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<script src=\"vendors/jquery.counterup/jquery.counterup.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Morris Charts JavaScript -->\n");
      out.write("    <script src=\"vendors/raphael/raphael.min.js\"></script>\n");
      out.write("    <script src=\"vendors/morris.js/morris.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Easy pie chart JS -->\n");
      out.write("    <script src=\"vendors/easy-pie-chart/dist/jquery.easypiechart.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Flot Charts JavaScript -->\n");
      out.write("    <script src=\"vendors/flot/excanvas.min.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.pie.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"vendors/flot/jquery.flot.crosshair.js\"></script>\n");
      out.write("    <script src=\"vendors/jquery.flot.tooltip/js/jquery.flot.tooltip.min.js\"></script>\n");
      out.write("    \n");
      out.write("    \t<!-- Dropify JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropify/dist/js/dropify.min.js\"></script>\n");
      out.write("\t\n");
      out.write("        <!-- EChartJS JavaScript -->\n");
      out.write("    <script src=\"vendors/echarts/dist/echarts-en.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <!-- Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/init.js\"></script>\n");
      out.write("    <script src=\"dist/js/dashboard2-data.js\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t<!-- Dropzone JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropzone/dist/dropzone.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Dropify JavaScript -->\n");
      out.write("\t<script src=\"vendors/dropify/dist/js/dropify.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Form Flie Upload Data JavaScript -->\n");
      out.write("\t<script src=\"dist/js/form-file-upload-data.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- FeatherIcons JavaScript -->\n");
      out.write("\t<script src=\"dist/js/feather.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- Toggles JavaScript -->\n");
      out.write("\t<script src=\"vendors/jquery-toggles/toggles.min.js\"></script>\n");
      out.write("\t<script src=\"dist/js/toggle-data.js\"></script>\n");
      out.write("        \n");
      out.write("          <!-- Tinymce JavaScript -->\n");
      out.write("    <script src=\"vendors/tinymce/tinymce.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Tinymce Wysuhtml5 Init JavaScript -->\n");
      out.write("    <script src=\"dist/js/tinymce-data.js\"></script>\n");
      out.write("\t\n");
      out.write("        \n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSearch.getAllPostsWithoutWhere()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("    \n");
          out.write("            <section class=\"hk-sec-wrapper\">\n");
          out.write("                <div class=\"row\">    \n");
          out.write("                    <div class=\"col-sm\">\n");
          out.write("                        <div class=\"media pa-20 border border-2 border-light rounded\">\n");
          out.write("                            <img class=\"mr-15 circle d-100\" src=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getImage() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" alt=\"Generic placeholder image\">\n");
          out.write("                                <div class=\"media-body\">\n");
          out.write("                                    <h4 class=\"mb-5\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getTitle() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4> \n");
          out.write("                                     ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getPostbody() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                </div>\n");
          out.write("                               \n");
          out.write("                        </div>\n");
          out.write("                                    <div class=\"form-group mt-10\">\n");
          out.write("                                            <div class=\"input-group\">\n");
          out.write("                                                <div class=\" avatar avatar-sm mr-15\">\n");
          out.write("                                                    <img class=\"avatar-img rounded-circle\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getImage() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Generic placeholder image\">\n");
          out.write("                                                </div>\n");
          out.write("                                                <form method=\"get\" action=\"CommentServelet\" enctype=\"multipart/form-data\">\n");
          out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Type A Comment in Here\" aria-label=\"Recipient's username\" aria-describedby=\"basic-addon2\">\n");
          out.write("                                                </form>\n");
          out.write("                                                <div class=\"input-group-append\">\n");
          out.write("                                                    <button class=\"btn btn-light\" type=\"button\"><i data-feather=\"send\"></i></button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                    </div>\n");
          out.write("                             \n");
          out.write("                </div>\n");
          out.write("            </section>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
