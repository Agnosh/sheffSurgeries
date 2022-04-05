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
            <div class="first"> <%-- This is the code for the first button, they are attached to there respective controllers. --%>
                <h3>Appointments<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Appointment">Appointments</g:link>

                </button>

            </div>

            <div class="second"> <%-- This is the code for the second button, they are attached to there respective controllers. --%>
                <h3>Doctors<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Doctor">Doctors</g:link>

                </button>

            </div>

            <div class="third"> <%-- This is the code for the third button, they are attached to there respective controllers. --%>
                <h3>Nurses<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Nurse">Nurses</g:link>

                </button>

            </div>

            <div class="fourth"> <%-- This is the code for the fourth button, they are attached to there respective controllers. --%>
                <h3>Patients<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Patient">Patients</g:link>

                </button>

            </div>

            <div class="fifth"> <%-- This is the code for the fifth button, they are attached to there respective controllers. --%>
                <h3>Prescriptions<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Prescription">Prescriptions</g:link>

                </button>

            </div>

            <div class="sixth"> <%-- This is the code for the sixth button, they are attached to there respective controllers. --%>
                <h3>Receptionists<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Receptionist">Receptionists</g:link>

                </button>

            </div>

            <div class="seventh"> <%-- This is the code for the seventh button, they are attached to there respective controllers. --%>
                <h3>Surgeries<h3>

                <button type="button"class="btn btn-success" style="margin:3px";>

                    <g:link controller="Surgery">Surgeries</g:link>

                </button>

            </div>

        </div>
        </section>
    </div>
</div>

</body>
</html>