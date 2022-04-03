<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<div class="row">

    <asset:image src="banner.jpeg" <!-- This code adds the image and also changes its size. -->
        width="1920"
        height="300"/>
</div>

<g:layoutBody/>

<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
                <a href="https://www.nhs.uk" target="_blank">
                    <asset:image src="homepage.jpg" alt="NHS Homepage" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://www.nhs.uk" target="_blank">Grails Guides</a></strong>
                <p>Wanting to know more? Visit our website: <a href="https://www.nhs.uk" target="_blank">NHS</a> for anything you may want to know.</p>

            </div>
            <div class="col">
                <a href="https://www.nhs.uk/conditions/" target="_blank">
                    <asset:image src="a-z.png" alt="NHS A-Z" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://www.nhs.uk/conditions/" target="_blank">Documentation</a></strong>
                <p>Need help finding something then use our handy: <a href="https://www.nhs.uk/conditions/" target="_blank">A-Z</a>.</p>

            </div>
            <div class="col">
                <a href="https://www.nhs.uk/contact-us/" target="_blank">
                    <asset:image src="phone.jpg" alt="NHS Contact-Us" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://www.nhs.uk/contact-us/" target="_blank">Join the Community</a></strong>
                <p>Want to get in contact? You can here: <a href="https://www.nhs.uk/contact-us/" target="_blank">Contact Us</a>.</p>
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
