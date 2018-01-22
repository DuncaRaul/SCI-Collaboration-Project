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
                    <li><a href="contact">CONTACT US</a></li>
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
<div class="main_bg">
    <div class="container">
        <div class="main">
            <div class="details">
                <a href="#"><h2>Lorem ipsum dolor sit amet consectetur adipisicing</h2></a>
                <div class="det_pic">
                    <img src="images/det_pic.jpg" alt=""/>
                </div>
                <div class="det_text">
                    <p class="para">There are many variations of passages of Lorem Ipsum available, but the majority
                        have suffered alteration in some form, by injected humour, or randomised words which don't look
                        even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure
                        there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators
                        on the Internet tend to repeat predefined chunks as necessary, making this the first true
                        generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful
                        of model sentence structures, to generate Lorem Ipsum which looks reasonable. </p>
                    <p class="para">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a
                        piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard
                        McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more
                        obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the
                        word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections
                        1.10.32 and 1.10.33 of "de Finibus Bonorum et Malorum" (The Extremes of Good and Evil) by
                        Cicero, written in 45 BC. This book is a treatise on the theory of ethics</p>
                    <div class="read_more">
                        <a href="details.html">read more</a>
                    </div>
                </div>
            </div>
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