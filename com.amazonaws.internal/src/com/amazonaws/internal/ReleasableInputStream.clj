(ns com.amazonaws.internal.ReleasableInputStream
  "An input stream that can have the close operation disabled (to avoid
  accidentally being closed). This is necessary, for example, when an input
  stream needs to be marked-and-reset multiple times but only as long as the
  input stream has not been closed. To survive not being accidentally closed,
  the close method can be disabled via disableClose().

  The creator of this input stream should therefore always call
  release() in a finally block to truly release the underlying
  resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal ReleasableInputStream]))

(defn *wrap
  "Wraps the given input stream into a ReleasableInputStream if
   necessary. Note if the given input stream is a FileInputStream, a
   ResettableInputStream which is a specific subclass of
   ReleasableInputStream will be returned.

  is - `java.io.InputStream`

  returns: `com.amazonaws.internal.ReleasableInputStream`"
  (^com.amazonaws.internal.ReleasableInputStream [^java.io.InputStream is]
    (ReleasableInputStream/wrap is)))

(defn close
  "If closeDisabled is false, closes this input stream and releases
   any system resources associated with the stream. Otherwise, this method
   does nothing."
  ([^ReleasableInputStream this]
    (-> this (.close))))

(defn release
  "Closes the underlying stream file and releases any system resources associated."
  ([^ReleasableInputStream this]
    (-> this (.release))))

(defn close-disabled?
  "Returns true if the close method has been disabled; false otherwise. Once
   the close method is disabled, caller would be responsible to release
   resources via release().

  returns: `boolean`"
  (^Boolean [^ReleasableInputStream this]
    (-> this (.isCloseDisabled))))

(defn disable-close
  "Used to disable the close method. Once the close method is disabled,
   caller would be responsible to release resources via release().

  returns: `<T extends com.amazonaws.internal.ReleasableInputStream> T`"
  ([^ReleasableInputStream this]
    (-> this (.disableClose))))

