[#ftl]
<!DOCTYPE html>
<html>
<head>
    <title>hotel-fortune bootstrap Design website | Home :: w3layouts</title>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,700italic,800italic,400,300,600,700,800'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Quicksand:400,700' rel='stylesheet' type='text/css'>
    <link href="/css/bootstrap.css" rel='stylesheet' type='text/css'/>
    <link href="/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="/js/jquery.min.js"></script>
</head>
<body>
<!--header starts-->
<div class="header">
    <div class="top-header">
        <div class="container">
            <div class="logo">
                <a href="/./homepage"><img src="/images/logo.png"/></a>
                <div class="clearfix"></div>
            </div>
            <span class="menu"> </span>
            <div class="m-clear"></div>
            <div class="top-menu">
                <ul>
                    <li><a href="/./homepage">START</a></li>
                    <li><a href="/./homepage/facilities">FACILITIES</a></li>
                    <li><a href="/./client/login">BOOKING</a></li>
                    <li><a href="/./homepage/details">DETAILS</a></li>
                    <li><a  href="/./homepage/contact">CONTACT US</a></li>
                    <li><a href="/./client/login">LOGIN</a></li>
                    <div class="clearfix"></div>
                </ul>
                <script>
                    $("span.menu").click(function () {
                        $(".top-menu ul").slideToggle(200);
                    });
                </script>
            </div>
        </div>
    </div>
</div>
<!---->
<div class="contact-bg">
    <div class="container">
        <div class="contact-us">
            <div class="contact-us_left">
                <div class="contact-us_info">
                    <h3 class="style">Find Us Here</h3>
                    <div class="map">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d21909.099730929236!2d26.960685235528864!3d46.65367427204829!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40b564af5c1d6691%3A0x8678b26db640b372!2zUHLEg2plyJl0aSA2MDc2MzksIFJvbWFuaWE!5e0!3m2!1sen!2sus!4v1516647190930" width="400" height="300" frameborder="0" style="border:0" allowfullscreen></iframe>
                        <br>

                    </div>
                </div>
                <div class="company_address">
                    <h3 class="style">Hotel Information :</h3>
                    <p>320 Spring Street,</p>
                    <p>607639 Spring City,</p>
                    <p>Spring Country.</p>
                    <p>Phone:0040111222333</p>
                    <p>Fax: 0040444555666</p>
                    <p>Email: <a href="mailto:dani@raul.">dani@raul.plm</a></p>
                    <p>Follow on: <a href="https://www.facebook.com/danielundercow">Facebook</a>, <a href="https://www.twitch.tv/danielandercau">Twitch</a></p>
                </div>
            </div>
            <div class="contact_right">
                <div class="contact-form">
                    <h3 class="style">Contact Us</h3>
                    <form method="post" action="homepage.ftl">
                        <div>
                            <span><label>NAME</label></span>
                            <span><input name="userName" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>E-MAIL</label></span>
                            <span><input name="userEmail" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>MOBILE</label></span>
                            <span><input name="userPhone" type="text" class="textbox"></span>
                        </div>
                        <div>
                            <span><label>SUBJECT</label></span>
                            <span><textarea name="userMsg"> </textarea></span>
                        </div>
                        <div>
                            <input type="submit" value="submit us">
                        </div>
                    </form>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>
<!---->
<div class="fotter">
    <div class="container">
        <h3>Our customer's words:</h3>
        <h4>"Biscuitii sunt biscuiti pentru ca nu sunt jeleuri" - Gica Hagi, 2014</h4>
        <i class="man"></i>
    </div>
</div>
<!---->
<div class="fotter-info">
    <div class="container">
        <div class="col-md-5 details">
            <div class="hotel-info">
                <h4>ABOUT THIS HOTEL</h4>
                <p>Set on the shores of the Spring beaches in Spring, Spring country's economic capital, Spring hotel
                    gives you a warm welcome. Renovated, modern rooms and a restaurant serving a wide range of
                    mouthwatering dishes, snacks, and refreshments. </p>
                <p>The hotel offers plenty of opportunities to relax, have fun and to put your everyday worries aside
                    during your stay.</p>
            </div>
            <div class="news">
                <h4>LATEST NEWS</h4>
                <h5>Spring Hotel Joins DeluxeHotels</h5>
                <a href="#">10 JAN</a>
                <h5>Best Places To Visit 2018</h5>
                <a href="#">03 JAN</a>
                <h5>Happy Chirstmas To Everyone</h5>
                <a href="#">25 DEC</a>
                <h5>Various Offers</h5>
                <a href="#">12 DEC</a>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="member">
            <h4>MEMBERS AREA</h4>
            <form>
                <p>Username</p>
                <input type="text" placeholder="username" required/>
                <p>Password</p>
                <input type="password" placeholder="password" required/>
                <input type="submit" value="LOGIN"/>
                <input type="submit" value="REGISTER"/>
            </form>
        </div>
        <div class="clearfix"></div>
    </div>
    <div class="clearfix"></div>
</div>
<h6>Template by <a href="http://w3layouts.com/">W3layouts</h6>
</div>
<!---->

</body>
</html>