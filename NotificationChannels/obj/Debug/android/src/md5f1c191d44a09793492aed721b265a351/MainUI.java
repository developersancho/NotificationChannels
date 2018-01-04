package md5f1c191d44a09793492aed721b265a351;


public class MainUI
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("NotificationChannels.MainUI, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainUI.class, __md_methods);
	}


	public MainUI ()
	{
		super ();
		if (getClass () == MainUI.class)
			mono.android.TypeManager.Activate ("NotificationChannels.MainUI, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MainUI (android.view.View p0, md5f1c191d44a09793492aed721b265a351.MainActivity p1)
	{
		super ();
		if (getClass () == MainUI.class)
			mono.android.TypeManager.Activate ("NotificationChannels.MainUI, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:NotificationChannels.MainActivity, NotificationChannels, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0, p1 });
	}


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
