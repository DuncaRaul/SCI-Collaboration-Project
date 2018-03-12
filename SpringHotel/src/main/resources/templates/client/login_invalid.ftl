[#ftl]
<html>
<head>
    <title>SPRING Hotel</title>
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
            </div>
            <span class="menu"> </span>
            <div class="m-clear"></div>
            <div class="top-menu">
                <ul>
                    <li><a href="/./homepage">START</a></li>
                    <li><a href="/./homepage/facilities">FACILITIES</a></li>
                    <li><a href="/./client/login">BOOKING</a></li>
                    <li><a href="/./homepage/details">DETAILS</a></li>
                    <li><a href="/./homepage/contact">CONTACT US</a></li>
                    <li><a href="login">LOGIN</a></li>

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

    <div class="clearfix"></div>

    <div class="package text-center">
        <div class="container">
            <!-- requried-jsfiles-for owl -->

            <h4 style="color:red">Invalid username or password.</h4>
            <p></p>

            <div class="memberr">


                <form method="POST" action="/client/login">
                    <p>Username: <input type="text" name="userName"/></p>
                    <p>Password: <input type="password" name="password"/></p>


                    <input type="submit" value="LOGIN"/>

                </form>

                <form method="GET" action="/client/register">
                    <input type="submit" value="REGISTER">
                </form>

            </div>
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
</body>
</html>