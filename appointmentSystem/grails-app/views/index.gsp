<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries Online | Home</title>
</head>
<body>



<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
            <h1>Welcome to Sheffield Surgeries Online</h1>

        <div class ="row">
            <div class="first"> <!-- This code changes the links to the different pages into buttons. -->
                <h3>Appointments<h3>

            <p>Appointments</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Appointment">Appointments</g:link>

                </button>

            </div>

            <div class="second">
                <h3>Doctors<h3>

            <p>Doctors</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Doctor">Doctors</g:link>

                </button>

            </div>

            <div class="third">
                <h3>Nurses<h3>

            <p>Nurses</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Nurse">Nurses</g:link>

                </button>

            </div>

            <div class="fourth">
                <h3>Patients<h3>

            <p>Patients</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Patient">Patients</g:link>

                </button>

            </div>

            <div class="fifth">
                <h3>Prescriptions<h3>

            <p>Prescriptions</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Prescription">Prescriptions</g:link>

                </button>

            </div>

            <div class="sixth">
                <h3>Receptionists<h3>

            <p>Receptionists</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Receptionist">Receptionists</g:link>

                </button>

            </div>

            <div class="seventh">
                <h3>Surgeries<h3>

            <p>Surgeries</p>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Surgery">Surgeries</g:link>

                </button>

            </div>

                <asset:image src="doctor.jpeg" <!-- This code adds the image and also changes its size. -->
                width="225"
                height="300"/>
        </div>
        </section>
    </div>
</div>

</body>
</html>
