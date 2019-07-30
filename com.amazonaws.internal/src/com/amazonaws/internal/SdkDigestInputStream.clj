(ns com.amazonaws.internal.SdkDigestInputStream
  "Base class for AWS Java SDK specific DigestInputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkDigestInputStream]))

(defn ->sdk-digest-input-stream
  "Constructor.

  stream - `java.io.InputStream`
  digest - `java.security.MessageDigest`"
  (^SdkDigestInputStream [^java.io.InputStream stream ^java.security.MessageDigest digest]
    (new SdkDigestInputStream stream digest)))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^SdkDigestInputStream this]
    (-> this (.isMetricActivated))))

(defn skip
  "Skips over and discards n bytes of data from this input
   stream, while taking the skipped bytes into account for digest
   calculation. The skip method may, for a variety of reasons,
   end up skipping over some smaller number of bytes, possibly
   0. This may result from any of a number of conditions;
   reaching end of file before n bytes have been skipped is
   only one possibility. The actual number of bytes skipped is returned. If
   n is negative, no bytes are skipped.


   The skip method of this class creates a byte array and then
   repeatedly reads into it until n bytes have been read or the
   end of the stream has been reached. Subclasses are encouraged to provide
   a more efficient implementation of this method. For instance, the
   implementation may depend on the ability to seek.

  n - the number of bytes to be skipped. - `long`

  returns: the actual number of bytes skipped. - `long`

  throws: java.io.IOException - if the stream does not support seek, or if some other I/O error occurs."
  (^Long [^SdkDigestInputStream this ^Long n]
    (-> this (.skip n))))

(defn release
  "Description copied from interface: Releasable"
  ([^SdkDigestInputStream this]
    (-> this (.release))))

