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
	compile 'com.appzilo.sdk:offerwall:1.+'
}
```

The following permissions are required to be added into the app manifest:

```
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" tools:ignore="ProtectedPermissions" />
```

The App Review category requires the permission above.

```
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" tools:ignore="ProtectedPermissions" />
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

The permissions above are needed in order to enable the screenshot function, which will help reduce potential spam and increase submission success rate

## Usage

Initialize sdk

```
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID");
Offerwall.show();
```

Checking callback (if enable screenshot)
```
//Add into onCreate override function
Offerwall.onNewIntent(getApplicationContext(), getIntent());
```

Passing custom parameters (SUB_ID, SUB_ID2, SUB_ID3, SUB_ID4, SUB_ID5)

```
HashMap<String, String> params = new HashMap<>();
params.put(Offerwall.SUB_ID, "XXXX");
params.put(Offerwall.SUB_ID2, "YYYY");
Offerwall.initApp(this, "APP_KEY", "UNIQUE_USER_ID", params);
Offerwall.show();
```

## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) and [ACCESS_NETWORK_STATE](https://developer.android.com/reference/android/Manifest.permission.html#ACCESS_NETWORK_STATE) permissions by default as we need it to make network requests and check if the network is available:

```
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```  





