## Appzilo Offerwall
Appzilo offerwall for Android support API 17 and above.

## Installation
Add the following to your Project `build.gradle` file:

```
repositories {
	jcenter()
}
```

Add the following dependency to your app's `build.gradle` file:

```
dependencies {
	implementation 'com.appzilo.sdk:offerwall:1.3.0'
}
```

The following permissions are required to be added into the app manifest:

```
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" tools:ignore="ProtectedPermissions" />
```

The App Review category requires the permission above.

```
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

```
//Optional
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" tools:ignore="ProtectedPermissions" />

```

The permissions above are needed in order to enable the screenshot function, which will help reduce potential spam and increase submission success rate

## Usage

Initialize sdk

```
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID");
Offerwall.show();
```

Checking callback (if enable screenshot)

Condition 1: 

Offerwall is implemented in your application main activity, include code below into onCreate function 
```
//Add into onCreate override function
Offerwall.onNewIntent(getApplicationContext(), getIntent());
```
Condition 2:

Offerwall is implemented in other activity

1) Please add in your main acitivity path `android:parentActivityName=".activity.XXX"` into the activity tag that used to open offerwall inside manifest.
2) Implement `Offerwall.onNewIntent(getApplicationContext(), getIntent());` into onCreate/onResume function inside activity class that used to open offerwall.
3) After success screenshot, will pass Offerwall.AZ_SCREENSHOT boolean to target activity.

Passing custom parameters (SUB_ID, SUB_ID2, SUB_ID3, SUB_ID4, SUB_ID5)

```
HashMap<String, String> params = new HashMap<>();
params.put(Offerwall.SUB_ID, "XXXX");
params.put(Offerwall.SUB_ID2, "YYYY");
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID", params);
Offerwall.show();
```



Support click notification to redirect to related page (if app support notification)

You will need to include [CHN] and [RMK] in your postback url for server to server postback.
[CHN] will be used by sdk to redirect to related page while [RMK] can be used as the content in the notification.

Include `intent.putExtra(Offerwall.OFFERWALL_CHANNEL, XXX);` into the class where click notification is called in your app.
Redirect and pass value above to the activity where offerwall is opened. (activity that include `Offerwall.onNewIntent(getApplicationContext(), getIntent());`)

ps: XXX is the [CHN] value passed inside postback url.


## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) and [ACCESS_NETWORK_STATE](https://developer.android.com/reference/android/Manifest.permission.html#ACCESS_NETWORK_STATE) permissions by default as we need it to make network requests and check if the network is available:

```
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```  





