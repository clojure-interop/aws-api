(ns com.amazonaws.internal.Releasable
  "Used for releasing a resource.

  For example, the creation of a ResettableInputStream would entail
  physically opening a file. If the opened file is meant to be closed only (in
  a finally block) by the very same code block that created it, then it is
  necessary that the release method must not be called while the execution is
  made in other stack frames.

  In such case, as other stack frames may inadvertently or indirectly call the
  close method of the stream, the creator of the stream would need to
  explicitly disable the accidental closing via
  ResettableInputStream#disableClose(), so that the release method
  becomes the only way to truly close the opened file."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal Releasable]))

(defn release
  "Releases the allocated resource. This method should not be called except
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
  ([^Releasable this]
    (-> this (.release))))

