# Dagger2Recipes-ActivitiesMultibinding
Example app which shows how to build Activities Subcomponents Multibinding

---

Starting from Dagger 2.7 there is a new way of declaring Subcomponents (my [@Module.subcomponents](http://google.github.io/dagger/api/2.7/dagger/Module.html#subcomponents--)). Thanks to this we are able to decouple AppComponent from Activities Subcomponents. 

Using Multibinding we can inject Activity Subcomponents builders without passign instance of AppComponent to Activities what means that finally we can test Activities decoupled from the whole Application. We are able to provide mock objects to our activity without using tools like [DaggerMock](https://github.com/fabioCollini/DaggerMock).

Check blog post: [Activities Multibinding in Dagger 2](http://frogermcs.github.io/activities-multibinding-in-dagger-2/) for more details.
