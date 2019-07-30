(ns com.amazonaws.internal.SdkInputStream
  "Base class for AWS Java SDK specific InputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkInputStream]))

(defn ->sdk-input-stream
  "Constructor."
  (^SdkInputStream []
    (new SdkInputStream )))

(defn metric-activated?
  "Description copied from interface: MetricAware

  returns: `boolean`"
  (^Boolean [^SdkInputStream this]
    (-> this (.isMetricActivated))))

(defn release
  "WARNING: Subclass that overrides this method must NOT call
   super.release() or else it would lead to infinite loop.

   Releases the allocated resource. This method should not be called except
   by the caller who allocated the resource at the very top of the call
   stack. This allows, typically, a Closeable resource to be not
   unintentionally released owing to the calling of the
   Closeable.close() methods by implementation deep down in the call
   stack.

   For example, the creation of a ResettableInputStream would entail
   physically opening a file. If the opened file is meant to be closed only
   (in a finally block) by the very same code block that created it, then it
   is necessary that the release method must not be called while the
   execution is made in other stack frames.

   In such case, as other stack frames may inadvertently or indirectly call
   the close method of the stream, the creator of the stream would need to
   explicitly disable the accidental closing via
   ResettableInputStream#disableClose(), so that the release method
   becomes the only way to truly close the opened file."
  ([^SdkInputStream this]
    (-> this (.release))))

