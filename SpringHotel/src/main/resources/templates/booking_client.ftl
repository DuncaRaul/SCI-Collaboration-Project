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
                <a href="/./homepage_client"><img src="/images/logo.png"/></a>
                <div class="clearfix"></div>
            </div>
            <span class="menu"> </span>
            <div class="m-clear"></div>
            <div class="top-menu">
                <ul>
                    <li><a href="/./homepage_client">START</a></li>
                    <li><a href="/./homepage_client/facilities_client">FACILITIES</a></li>
                    <li><a href="/./homepage_client/booking_client">BOOKING</a></li>
                    <li><a href="/./homepage_client/details_client">DETAILS</a></li>
                    <li><a href="/./homepage_client/contact_client">CONTACT US</a></li>
                    <li><a href="/./homepage">LOGOUT</a></li>
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
<div class="contact-bg2">
    <div class="container">
        <div class="booking">
            <h3>Booking</h3>
            <div class="col-md-8 booking-form">
                <form>
                    <h5>NAME</h5>
                    <input type="text" name="name">
                    <h5>E-MAIL</h5>
                    <input type="text" name="email">
                    <h5>PHONE</h5>
                    <input type="text" name="phoneNumber">
                    <h5>PARKING</h5>
                    <input min="0" max="1" type="number" id="quantity" name="hasParking" value="0"
                                               class="form-control input-small">
                    <h5>PET CARE</h5>
                    <input min="0" max="1" type="number" id="quantity" name="hasPetCare" value="0"
                                               class="form-control input-small">
                    <h5>CHECK IN</h5>
                    <select class="checkIn">
                        <option>01</option>
                        <option>02</option>
                        <option>03</option>
                        <option>04</option>
                        <option>05</option>
                        <option>06</option>
                        <option>08</option>
                        <option>09</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
                        <option>21</option>
                        <option>22</option>
                        <option>23</option>
                        <option>24</option>
                        <option>25</option>
                        <option>26</option>
                        <option>27</option>
                        <option>28</option>
                        <option>29</option>
                        <option>30</option>
                        <option>31</option>
                    </select>
                    <select class="checkIn">
                        <option>Jan</option>
                        <option>Feb</option>
                        <option>Mar</option>
                        <option>Apr</option>
                        <option>May</option>
                        <option>June</option>
                        <option>July</option>
                        <option>Aug</option>
                        <option>Sep</option>
                        <option>Oct</option>
                        <option>Nov</option>
                        <option>Dec</option>
                    </select>
                    <select class="checkIn">
                        <option>2018</option>
                    </select>
                    <h5>CHECK OUT</h5>
                    <select class="checkOut">
                        <option>01</option>
                        <option>02</option>
                        <option>03</option>
                        <option>04</option>
                        <option>05</option>
                        <option>06</option>
                        <option>08</option>
                        <option>09</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                        <option>13</option>
                        <option>14</option>
                        <option>15</option>
                        <option>16</option>
                        <option>17</option>
                        <option>18</option>
                        <option>19</option>
                        <option>20</option>
                        <option>21</option>
                        <option>22</option>
                        <option>23</option>
                        <option>24</option>
                        <option>25</option>
                        <option>26</option>
                        <option>27</option>
                        <option>28</option>
                        <option>29</option>
                        <option>30</option>
                        <option>31</option>
                    </select>
                    <select class="checkOut">
                        <option>Jan</option>
                        <option>Feb</option>
                        <option>Mar</option>
                        <option>Apr</option>
                        <option>May</option>
                        <option>June</option>
                        <option>July</option>
                        <option>Aug</option>
                        <option>Sep</option>
                        <option>Oct</option>
                        <option>Nov</option>
                        <option>Dec</option>
                    </select>
                    <select class="checkOut">
                        <option>2018</option>
                    </select>
                    <h5 class="mem">ROOM FOR</h5>
                    <input min="1" max="3" type="number" id="quantity" name="numberOfPeople" value="1"
                           class="form-control input-small">
                    <h5>ADDITIONAL INFORMATION</h5>
                    <textarea name="additionalInformation"></textarea>
                    <input type="submit" value="Submit">
                    <input type="reset" value="Reset">
                </form>
            </div>
            <div class="col-md-4 booking-news">
                <h4>Latest News</h4>
                <div class="LatestNews">
                    <p>The UN-sponsored International
                        Moose Census got off to a flying
                        start today with hopes for an increase
                        in the worldwide moose population
                        compared to last year’s disapointing
                        figures.</p>
                    <span>01-01-2018 </span>
                    <p></p>
                </div>
                <div class="LatestNews">
                    <p>According to Robbie McRobson,
                        head of the UN Moose Preservation
                        Council, worldwide moose numbers
                        are expected to grow markedly
                        on last year due to the traditional
                        moose strongholds of Canada.</p>
                    <span>01-12-2017 </span>
                </div>
                <div class="LatestNews">
                    <p>Records were smashed in
                        Nicaragua’s World Wrestling Championship
                        last night by 78-year-old
                        Maud Johnson, a grandmother of five.</p>
                    <span>05-11-2017 </span>
                </div>

                <div class="clearfix"></div>

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
        <div class="clearfix"></div>
    </div>
    <div class="clearfix"></div>
</div>
<h6>Template by <a href="http://w3layouts.com/">W3layouts</h6>
</div>
<!---->

</body>
</html>