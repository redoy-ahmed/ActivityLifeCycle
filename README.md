Activity Life Cycle Example

1. MainActivity

When we launch the app we can see logcat print output as follows:

---> onCreate: onCreate called
---> onStart: onStart called
---> onResume: onResume called

Then if we press home button we can see logcat print output as follows:

---> onPause: onPause called
---> onStop: onStop called

Then if we come back to our app again, we can see logcat print output as follows:

---> onRestart: onRestart called
---> onStart: onStart called
---> onResume: onResume called

Then if we kill our app, we can see logcat print output as follows:

---> onDestroy: onDestroy called

Pretty Clear HUH ! 👌🙀
