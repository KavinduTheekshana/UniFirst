<!DOCTYPE html>
<!-- 
Template Name: Brunette - Responsive Bootstrap 4 Admin Dashboard Template
Author: Hencework
Contact: https://hencework.ticksy.com/

License: You must have a valid license purchased only from templatemonster to legally use the template for your project.
-->
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Unifirst I Signup</title>
    <meta name="description" content="A responsive bootstrap 4 admin dashboard template by hencework" />

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="icon" href="dist/img/graduation.ico" type="image/x-icon">

    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css">
</head>

<body>
    <!-- Preloader -->
    <div class="preloader-it">
        <div class="loader-pendulums"></div>
    </div>
    <!-- /Preloader -->
    
	<!-- HK Wrapper -->
	<div class="hk-wrapper">

        <!-- Main Content -->
        <div class="hk-pg-wrapper hk-auth-wrapper">
            <header class="d-flex justify-content-between align-items-center">
                <a class="d-flex auth-brand" href="#">
                    <img class="brand-img" src="dist/img/logonew.png" alt="brand" />
                </a>
                <div class="btn-group btn-group-sm">
                    <a href="#" class="btn btn-outline-secondary">Help</a>
                    <a href="#" class="btn btn-outline-secondary">About Us</a>
                </div>
            </header>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xl-5 pa-0">
                        <div class="auth-cover-img overlay-wrap" style="background-image:url(dist/img/uni2.jpg);">
                            <div class="auth-cover-info py-xl-0 pt-100 pb-50">
                                <div class="auth-cover-content w-xxl-75 w-sm-90 w-100">
                                    <h1 class="display-3 text-white mb-20">Enjoy unlimited beautiful display content area</h1>
                                    <p class="text-white">The passage experienced a surge in popularity during the 1960s when Letraset used it on their dry-transfer sheets, and again during the 90s as desktop publishers bundled the text with their software.</p>
                                    <div class="play-wrap">
                                        <a class="play-btn" href="#"></a>
                                        <span>How it works ?</span>
                                    </div>
                                </div>
                            </div>
                            <div class="bg-overlay bg-trans-dark-50"></div>
                        </div>
                    </div>
                    <div class="col-xl-7 pa-0">
                        <div class="auth-form-wrap py-xl-0 py-50">
                            <div class="auth-form w-xxl-55 w-xl-75 w-sm-90 w-100">
                                
                                
                                
                                
                                <form action="RegisterServelet" method="post">
                                    <h1 class="display-4 mb-10">Sign up for free</h1>
                                    <p class="mb-30">Create your account and start your free trial today</p>
                                    <!-- <div class="form-row">
                                        <div class=" col-md-6 form-group">
                                            <input class="form-control" placeholder="First name" value="" type="text">
                                        </div>
                                        <div class="col-md-6 form-group">
                                            <input class="form-control" placeholder="Last name" value="" type="text">
                                        </div>
                                    </div>-->
                                    <div class="form-group">
                                        <input class="form-control" placeholder="University or company Name" type="text" name="name">
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Address" type="text" name="address">
                                    </div>
                                    <div class="form-row">
                                        <div class=" col-md-12 form-group">
                                            <select class="form-control custom-select" name="user_role" id="mySelect" onclick="myFunction()">
                                                <option selected value="University">University</option>
                                                <option value="Company">Company</option>
                                            </select>
                                        </div>
                                        
<!--                                        <div class=" col-md-4 form-group">
                                            <select class="form-control custom-select" name="type" id="mySelect" onclick="myFunction()">
                                                <option selected value="1">University</option>
                                                <option value="3">Company</option>
                                            </select>
                                        </div>-->
                                        
                                        
                                        
                                        <script>
                                  var check = function() {
                                  if (document.getElementById('password').value ==
                                    document.getElementById('confirm_password').value) {
                                    document.getElementById('message').style.color = '';
                                    document.getElementById('message').innerHTML = 'Password is Matching';
                                  } else{
                                    document.getElementById('message').style.color = 'red';
                                    document.getElementById('message').innerHTML = 'Your Password Not Matching';
                                  }
                                }
                                    </script>
                                        
                                        
<!--                                        <div class=" col-md-8 form-group">
                                            <input class="form-control" placeholder="Industry Type" type="text" name="industry" id="industry">
                                        </div>-->
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Email" type="email" name="email">
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Password" id="password" type="password" name="password" onkeyup='check();'>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group">
                                            <input class="form-control" placeholder="Confirm Password" type="password" id="confirm_password" name="confirm_password" onkeyup='check();'>
<!--                                            <div class="input-group-append">
                                                <span class="input-group-text"><span class="feather-icon"><i data-feather="eye-off"></i></span></span>
                                            </div>-->
                                        </div>
                                        <span id='message'></span>
                                    </div>
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    <div class="custom-control custom-checkbox mb-25">
                                        <input class="custom-control-input" id="same-address" type="checkbox" checked name="agreement">
                                        <label class="custom-control-label font-14" for="same-address">I have read and agree to the <a href=""><u>term and conditions</u></a></label>
                                    </div>
                                    <button class="btn btn-primary btn-block" type="submit" >Register</button>
                                    <div class="option-sep">or</div>
<!--                                    <div class="form-row">
                                        <div class="col-sm-6 mb-20">
                                            <button class="btn btn-indigo btn-block btn-wth-icon"> <span class="icon-label"><i class="fa fa-facebook"></i> </span><span class="btn-text">Login with facebook</span></button>
                                        </div>
                                        <div class="col-sm-6 mb-20">
                                            <button class="btn btn-sky btn-block btn-wth-icon"> <span class="icon-label"><i class="fa fa-twitter"></i> </span><span class="btn-text">Login with Twitter</span></button>
                                        </div>
                                    </div>-->
                                    <p class="text-center">Already have an account? <a href="Login.jsp">Sign In</a></p>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /Main Content -->

    </div>
    <!-- /HK Wrapper -->

    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendors/popper.js/dist/umd/popper.min.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Slimscroll JavaScript -->
    <script src="dist/js/jquery.slimscroll.js"></script>

    <!-- Fancy Dropdown JS -->
    <script src="dist/js/dropdown-bootstrap-extended.js"></script>

    <!-- FeatherIcons JavaScript -->
    <script src="dist/js/feather.min.js"></script>

    <!-- Init JavaScript -->
    <script src="dist/js/init.js"></script>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

</body>

</html>