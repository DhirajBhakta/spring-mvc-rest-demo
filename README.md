How to run (deploy) ?
=====================

1. (embedded tomcat) :
   ---------------------------------------
   just cd to root of the project
   : mvn tomcat7:run


2. local instance of your tomcat
   --------------------------------------
   download tomcat9 from the offical page: (else just copy from .... <TBD>)

   -- cd ~
   -- mkdir servers
   -- cd servers
   -- tar -xvzf /u/bhaktaku/Downloads/...<TBD>
   -- cd tomcat9/conf
   -- vim tomcat-users.xml

      '''add the following lines'''

         <user username="admin" password="admin roles="manager-gui"/>
         <user username="bot" password="bot" roles="manager-script"/>

   -- vim server.xml

      ''' change the HTTP port from 8080 to 9999 '''

   -- vim ~/.m2/settings.xml

      ''' this should ideally be the content of this file'''

       <settings xmlns="http://maven.apache.org/SETTINGS/1.1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd">

         <servers>
           <server>
               <username>bot</username>
               <password>bot</password>
             <id>MyLocalTomcat</id>
           </server>
         </servers>

       </settings>



   -- navigate to project root:
      : mvn clean tomcat7:deploy
