<%-- 
    Document   : Footer
    Created on : Apr 23, 2019, 7:35:42 PM
    Author     : Kavindu Theekshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="hk-footer-wrap container">
        <footer class="footer">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <p>Powered by<a href="https://nsbm.lk/" class="text-dark" target="_blank">NSBM Green University</a> &nbsp 17.1 Plymouth SE © 2019</p>
                </div>
                <div class="col-md-6 col-sm-12">
                    <p class="d-inline-block">Follow us</p>
                    <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-facebook"></i></span></a>
                    <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-twitter"></i></span></a>
                    <a href="#" class="d-inline-block btn btn-icon btn-icon-only btn-indigo btn-icon-style-4"><span class="btn-icon-wrap"><i class="fa fa-google-plus"></i></span></a>
                </div>
            </div>
        </footer>
    </div>

    <script>


        setInterval(function (){var req = new XMLHttpRequest();
            req.onreadystatechange = function () {

                if (req.readyState === 4 && req.status === 200) {
                    if(req.responseText==="1"){
                        window.location="Login.jsp";
                    }
                }

            };
            req.open("GET", "checkSession", true);
            req.send();
            
            
        },5000);
    </script>
</html>
