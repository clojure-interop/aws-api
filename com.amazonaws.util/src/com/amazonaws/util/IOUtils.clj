(ns com.amazonaws.util.IOUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util IOUtils]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (IOUtils c : IOUtils.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.IOUtils[]`"
  ([]
    (IOUtils/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.IOUtils`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.IOUtils [^java.lang.String name]
    (IOUtils/valueOf name)))

(defn *to-byte-array
  "Reads and returns the rest of the given input stream as a byte array.
   Caller is responsible for closing the given input stream.

  is - `java.io.InputStream`

  returns: `byte[]`

  throws: java.io.IOException"
  ([^java.io.InputStream is]
    (IOUtils/toByteArray is)))

(defn *to-string
  "Reads and returns the rest of the given input stream as a string.
   Caller is responsible for closing the given input stream.

  is - `java.io.InputStream`

  returns: `java.lang.String`

  throws: java.io.IOException"
  (^java.lang.String [^java.io.InputStream is]
    (IOUtils/toString is)))

(defn *close-quietly
  "Closes the given Closeable quietly.

  is - the given closeable - `java.io.Closeable`
  log - logger used to log any failure should the close fail - `org.apache.commons.logging.Log`"
  ([^java.io.Closeable is ^org.apache.commons.logging.Log log]
    (IOUtils/closeQuietly is log)))

(defn *release
  "Releases the given Closeable especially if it was an instance of
   Releasable.

   For example, the creation of a ResettableInputStream would entail
   physically opening a file. If the opened file is meant to be closed only
   (in a finally block) by the very same code block that created it, then it
   is necessary that the release method must not be called while the
   execution is made in other stack frames.

   In such case, as other stack frames may inadvertently or indirectly call
   the close method of the stream, the creator of the stream would need to
   explicitly disable the accidental closing via
   ResettableInputStream#disableClose(), so that the release method
   becomes the only way to truly close the opened file.

  is - `java.io.Closeable`
  log - `org.apache.commons.logging.Log`"
  ([^java.io.Closeable is ^org.apache.commons.logging.Log log]
    (IOUtils/release is log)))

(defn *copy
  "Copies all bytes from the given input stream to the given output stream.
   Caller is responsible for closing the streams.

  in - `java.io.InputStream`
  out - `java.io.OutputStream`
  read-limit - `long`

  returns: `long`

  throws: java.io.IOException - if there is any IO exception during read or write or the read limit is exceeded."
  (^Long [^java.io.InputStream in ^java.io.OutputStream out ^Long read-limit]
    (IOUtils/copy in out read-limit))
  (^Long [^java.io.InputStream in ^java.io.OutputStream out]
    (IOUtils/copy in out)))

(defn *drain-input-stream
  "Read all remaining data in the stream.

  in - InputStream to read. - `java.io.InputStream`"
  ([^java.io.InputStream in]
    (IOUtils/drainInputStream in)))

