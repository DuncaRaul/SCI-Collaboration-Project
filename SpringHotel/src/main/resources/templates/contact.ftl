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
                    <li><a href="facilities">FACILITIES</a></li>
                    <li><a href="booking">BOOKING</a></li>
                    <li><a href="details">DETAILS</a></li>
                    <li><a  href="contact">CONTACT US</a></li>
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
                        <iframe width="100%" height="175" frameborder="0" scrolling="no" marginheight="0"
                                marginwidth="0"
                                src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed"></iframe>
                        <br>
                        <small><a
                                href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265"
                                style="color: #242424;text-shadow: 0 1px 0 #ffffff;text-align: left;font-size: 0.7125em;padding: 5px;font-weight: 600;">View
                            Larger Map</a></small>
                    </div>
                </div>
                <div class="company_address">
                    <h3 class="style">Hotel Information :</h3>
                    <p>500 Lorem Ipsum Dolor Sit,</p>
                    <p>22-56-2-9 Sit Amet, Lorem,</p>
                    <p>USA</p>
                    <p>Phone:(00) 222 666 444</p>
                    <p>Fax: (000) 000 00 00 0</p>
                    <p>Email: <a href="mailto:info@example.com">info(at)myhotel.com</a></p>
                    <p>Follow on: <a href="#">Facebook</a>, <a href="#">Twitter</a></p>
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