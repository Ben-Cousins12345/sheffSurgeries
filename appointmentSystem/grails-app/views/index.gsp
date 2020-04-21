<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<content tag="nav"> 
	
      	<li><a href="http://localhost:8080/surgery/index">Surgery</a></li>
        <li><a href="http://localhost:8080/doctor/index">Doctor</a></li>
        <li><a href="http://localhost:8080/patient/index">Patient</a></li>
        <li><a href="http://localhost:8080/receptionist/index">Receptionist</a></li>
	<li><a href="http://localhost:8080/nurse/index">Nurse</a></li>
	<li><a href="http://localhost:8080/appointment/index">Appointment</a></li>
	<li><a href="http://localhost:8080/prescription/index">Prescription</a></li>
     	
</content>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="logo.jpg" class="grails-logo"/>
    </div>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to SheffSurgeries Online Application</h1>

        <p>
           From this application you can view different surgeries as well as their doctors, nurses and patients. You can also view patient prescriptions and edit the people associated with each class.
        </p>

       <!-- <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>-->
    </section>
</div>

</body>
</html>
