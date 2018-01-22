[#ftl]
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
                <a href="homepage"><img src="/images/logo.png"/></a>
            </div>
            <span class="menu"> </span>
            <div class="m-clear"></div>
            <div class="top-menu">
                <ul>
                    <li><a href="homepage">START</a></li>
                    <li><a href="homepage/facilities">FACILITIES</a></li>
                    <li><a href="homepage/booking">BOOKING</a></li>
                    <li><a href="homepage/details">DETAILS</a>
                    <li><a href="homepage/contact">CONTACT US</a></li>
                    <li><a href="client/login">LOGIN</a></li>

                </ul>
                <script>
                    $("span.menu").click(function () {
                        $(".top-menu ul").slideToggle(200);
                    });
                </script>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="banner">
        <div class="banner-info text-center">
            <h3><label>Hello,</label> and welcome to</h3>
            <h1>SPRING HOTEL</h1>
            <span></span>
            <ul>
                <li><a class="scroll">HOTEL</a><i class="line"></i></li>
                <li><a class="scroll">SPA SALOON</a><i class="line2"></i></li>
                <li><a class="scroll">FINE DINING</a></li>
                <div class="clearfix"></div>
            </ul>
        </div>
    </div>
</div>
<!---strat-date-piker---->
<link rel="stylesheet" href="/css/jquery-ui.css"/>
<script src="/js/jquery-ui.js"></script>
<script>
    $(function () {
        $("#datepicker,#datepicker1").datepicker();
    });
</script>
<!---/End-date-piker---->
<link type="/text/css" rel="stylesheet" href="css/JFGrid.css"/>
<link type="/text/css" rel="stylesheet" href="css/JFFormStyle-1.css"/>
<script type="/text/javascript" src="js/JFCore.js"></script>
<script type="/text/javascript" src="js/JFForms.js"></script>
<!-- Set here the key for your domain in order to hide the watermark on the web server -->
<script type="/text/javascript">
	(function() {
		JC.init({
			domainKey: ''
		});
	})();


</script>

<!---->
<div class="package text-center">
    <div class="container">
        <h3><a href="homepage/booking">Book a room!</a></h3>
        <p></p>
        <p>Spring Hotel was designed in such a way that it suits anyone's needs. From single rooms to a penthouse, we
            guarantee that you will not regret
            your decision of choosing our hotel!</p>
        <!-- requried-jsfiles-for owl -->
        <link href="/css/owl.carousel.css" rel="stylesheet">
        <script src="/js/owl.carousel.js"></script>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({
                    items: 1,
                    lazyLoad: true,
                    autoPlay: true,
                    navigation: true,
                    navigationText: false,
                    pagination: false,
                });
            });
        </script>
        <!-- //requried-jsfiles-for owl -->
        <div id="owl-demo" class="owl-carousel">
            <div class="item text-center image-grid">
                <ul>
                    <li><img src="/images/1.jpg" alt=""></li>
                    <li><img src="/images/2.jpg" alt=""></li>
                    <li><img src="/images/3.jpg" alt=""></li>
                </ul>
            </div>
            <div class="item text-center image-grid">
                <ul>
                    <li><img src="/images/3.jpg" alt=""></li>
                    <li><img src="/images/4.jpg" alt=""></li>
                    <li><img src="/images/5.jpg" alt=""></li>
                </ul>
            </div>
            <div class="item text-center image-grid">
                <ul>
                    <li><img src="/images/6.jpg" alt=""></li>
                    <li><img src="/images/2.jpg" alt=""></li>
                    <li><img src="/images/8.jpg" alt=""></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!---->
<!---->
<div class="rooms text-center">
    <div class="container">
        <h3>Our Room Types</h3>
        <div class="room-grids">
            <div class="col-md-4 room-sec">
                <img src="images/pic1.jpg" alt=""/>
                <h4>Single Room</h4>
                <p>This type of room is recommended for 1 or 2 people. The room is packed with everything you need for
                    you to leave your
                    worries at home and to enjoy your visit in Spring city.</p>
                <div class="items">
                    <li><a href="#"><span class="img1"> </span></a></li>
                    <li><a href="#"><span class="img2"> </span></a></li>
                    <li><a href="#"><span class="img5"> </span></a></li>
                    <li><a href="#"><span class="img6"> </span></a></li>
                </div>
            </div>
            <div class="col-md-4 room-sec">
                <img src="images/pic2.jpg" alt=""/>
                <h4>Apartment</h4>
                <p>This type of room is typically recommended for a family or for a small group of people (3-8 people).
                    It is packed with everything the single room has to offer,
                    with some extra benefits, including a kitchen and two bathrooms.</p>
                <div class="items">
                    <li><a href="#"><span class="img1"> </span></a></li>
                    <li><a href="#"><span class="img2"> </span></a></li>
                    <li><a href="#"><span class="img4"> </span></a></li>
                    <li><a href="#"><span class="img5"> </span></a></li>
                    <li><a href="#"><span class="img6"> </span></a></li>
                </div>
            </div>
            <div class="col-md-4 room-sec">
                <img src="images/pic3.jpg" alt=""/>
                <h4>Penthouse</h4>
                <p>Spring Hotel's penthouse is for the party lovers. We have covered you with state of the art
                    electronics and amazing room design for you and
                    your friends to enjoy. Bring all your friends and party like a rockstar!</p>
                <div class="items">
                    <li><a href="#"><span class="img1"> </span></a></li>
                    <li><a href="#"><span class="img2"> </span></a></li>
                    <li><a href="#"><span class="img3"> </span></a></li>
                    <li><a href="#"><span class="img4"> </span></a></li>
                    <li><a href="#"><span class="img5"> </span></a></li>
                    <li><a href="#"><span class="img6"> </span></a></li>
                </div>
            </div>
            <div class="clearfix"></div>
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

            </form>

            <form method="GET" action ="/client/register">
                <input type="submit" value="REGISTER">
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