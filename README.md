# Login-With-MVP-


First question what i thought is why we need any architecture pattern to design any project ,.. we know how to create a project and why we need any other thing called patterns for app ....

then what i got to know is ... ya for simple project like HelloWorldApp you will feel a lot of control on flow , because code is too small

but

suppose we are working on a very big application then , do we have that control and clarification that ya if i am making some changes here it will reflect correctly there at some other place where i want to ...- No , because code is too complex and so much code .. so it can
be difficult for us to maintain our project at production stages .. So we should some pattern , agian we came in tht situation that
ya what is pattern??

pattern for code - a repetative decorative design or a way to keep the code simple , maintainable and decoupled and tastable

If we want to mantain our product's velocity and high product quality so we need to have a way to

keep the code simple , maintainable and decoupled and tastable . ands Using an architectural pattern like MVP we can achieve this what we want.

MVP allows us to keep our code SIMPLE , MAINTAINABLE , DECOUPLED , TESTABLE .

this is the need to use the MVP pattern .

MVP stand for MODEL VIEW PRESENTER

in MVP -

All the Tedious low- level android code that is needed to display our UI and interact with it , will be in View and All the higher level Business-Logic of what our app should do , will live in PRESENTER

so Two Things will be there VIEW and PRESENTER , and to achieve MVP .. . . we need to consider the activity/fragment as a view layer , and to intoduce a lightweight Presenter to control it .

The View (Activity or Fragment) is responsible for: -> Instantianting the presenter -> Informing the presenter of lifecycle events -> Informing the PRESENTER of input events -> Laying out the views and binding data to them -> Animations -> Event Tracking and Navigation to other screens.

The Presenter is responsible for: -> Loading Models loading data into models -> Keeping a reference to the model , and the state of the view -> Formatting what should be displayed and instructing the view to display it -> Interacting with database and network -> Deciding the Action to take , when input events are reveived .
   -sachin 
   :-) happyCoding :-) 
