# Java-final-project_Alumni-system

She-codes Alumni System

System that will serve she-codes' alumni.

Registration process ( will create new graduate alumni account for each new graduate ):
    - Generate alumni ID, Format ID creation : < firstname>..she-codes
    - Generate an OTP(one-time password) for the first login, consisted of 8 alphanumeric characters.
    - Generate a "resume" : the list of courses that the alumni completed successfully.

Alumni details ( alumni can set/update ):
    - Permanent password , must for the first login
    - Courses list, add more courses to their resume
    - Linkedin page ( if exists )
    - Job search status ( not looking for a change / not looking but open for suggestions/ looking for new challenge)

System functionality
    - RegisterNewGrad : will create an account for the new grad ( The new graduates are not involved in their account creation,
      and they can only update their details after the first login )
    - SheCodesLogin : Login to one's account, will allow her to access and set her information.
    - ShouldOfferJob : This method will receive a set of requirements(courses), and will return 'true' if the alumni meet these requirements and is open to job offers.
    - canMentor : method that will return 'true' if the mentor can mentor a specific course. 
      Mentors can mentor courses they graduated from or already mentored before. canMentor used by:
        - 'Mentors' are graduates that also mentor participants of one or more courses.
        - Allies' are team members that are not graduates, yet mentor one or more courses.
