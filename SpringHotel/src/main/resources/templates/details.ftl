[#ftl]

<!DOCTYPE html>
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
                    <li><a href="/./homepage/contact">CONTACT US</a></li>
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
                <h1>Spring Hotel. Because you deserve an amazing vacation!</h1>
                <div class="det_pic">
                    <img src="images/det_pic.jpg" alt=""/>
                </div>
                <div class="det_text">
                    <p class="para">It can be a place for you only where you can enjoy some quality time. We have a wide
                        range of spa offers, with masseurs specialized in
                        Chinese, Thai, Japanese and hot rocks massages. Also, if you want a day off of your busy
                        schedule we have high quality Wi-Fi so that you can watch your
                        favourite movies cum ar fi sa te uiti si tu altundeva pentru numele lu Dumnezăul meu fara de
                        care nu eram eu si Iisusul sfant care ne-a adus pe acest pamant because our hotel is the best in
                        the business.
                        Chiar nu inteleg de ce continui sa citesti chestia asta pentru ca aici nu o sa gasesti nicio
                        informatie utila in legatura cu efortul depus pentru a crea acest site.
                        Asta ii un text. Get a grip. Furthermore, our hotel has a skilled crew that can take care of any
                        spots that may get onto your clothes. Rest assured that Spring Hotel
                        is an amazing choice, and you won't regret chosing us.</p>
                    <p class="para">Spring Hotel is the perfect oasis for food lovers as we have the best chefs in
                        Spring Country that work passionately in order to offer
                        our clients the best dishes out there. You can enjoy your meal either at our restaurant sau
                        comanda-ti in puii mei o pizza ca nu mai am chef sa scriu
                        rahaturile astea ca ma doare capu si is bat. We have 3 different room types: single rooms,
                        apartments, and a penthouse, si daca nu-ti convine du-te
                        dracului. The penthouse has a gorgeous view over the city and it is guaranteed to stay printed
                        on your retina for at least a year, also giving you the chance to
                        make selfies that your friends will envy. Choose Spring Hotel, we won't disappoint you.</p>
                    <div class="read_more">
                        <a href="http://lmgtfy.com/?q=du-te+dracului">read more</a>
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

            <form method="POST" action="/client/loginn">
                <p>Username: <input type="text" name="userName"/></p>
                <p>Password: <input type="password" name="password"/></p>
                <input type="hidden" name="firstName" value="caca"/>
                <input type="hidden" name="lastName" value="raca"/>
                <input type="hidden" name="birthDate" value="12/12/1992"/>


                <input type="hidden" name="gender" value="MALE"/>


                <input type="submit" value="LOGIN"/>

            </form>

            <form method="GET" action="/client/register">
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