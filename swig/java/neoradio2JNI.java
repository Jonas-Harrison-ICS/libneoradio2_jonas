/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class neoradio2JNI {
  public final static native int StatusInProgress_get();
  public final static native int CommandStateHost_get();
  public final static native int CommandStateUnknown_get();
  public final static native int NEORADIO2_SUCCESS_get();
  public final static native int NEORADIO2_FAILURE_get();
  public final static native int NEORADIO2_ERR_WBLOCK_get();
  public final static native int NEORADIO2_ERR_INPROGRESS_get();
  public final static native int NEORADIO2_ERR_FAILURE_get();
  public final static native int NEORADIO2_MAX_DEVS_get();
  public final static native void Neoradio2DeviceInfo_name_set(long jarg1, Neoradio2DeviceInfo jarg1_, String jarg2);
  public final static native String Neoradio2DeviceInfo_name_get(long jarg1, Neoradio2DeviceInfo jarg1_);
  public final static native void Neoradio2DeviceInfo_serial_str_set(long jarg1, Neoradio2DeviceInfo jarg1_, String jarg2);
  public final static native String Neoradio2DeviceInfo_serial_str_get(long jarg1, Neoradio2DeviceInfo jarg1_);
  public final static native void Neoradio2DeviceInfo_vendor_id_set(long jarg1, Neoradio2DeviceInfo jarg1_, int jarg2);
  public final static native int Neoradio2DeviceInfo_vendor_id_get(long jarg1, Neoradio2DeviceInfo jarg1_);
  public final static native void Neoradio2DeviceInfo_product_id_set(long jarg1, Neoradio2DeviceInfo jarg1_, int jarg2);
  public final static native int Neoradio2DeviceInfo_product_id_get(long jarg1, Neoradio2DeviceInfo jarg1_);
  public final static native void Neoradio2DeviceInfo__reserved_set(long jarg1, Neoradio2DeviceInfo jarg1_, long jarg2);
  public final static native long Neoradio2DeviceInfo__reserved_get(long jarg1, Neoradio2DeviceInfo jarg1_);
  public final static native long new_Neoradio2DeviceInfo();
  public final static native void delete_Neoradio2DeviceInfo(long jarg1);
  public final static native int StatusChain_get();
}
