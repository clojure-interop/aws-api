(ns com.amazonaws.internal.ResettableInputStream
  "A mark-and-resettable input stream that can be used on files or file input
  streams.

  In particular, a ResettableInputStream allows the close operation to
  be disabled via ReleasableInputStream.disableClose() (to avoid accidentally being closed).
  This is necessary when such input stream needs to be marked-and-reset
  multiple times but only as long as the stream has not been closed.

  The creator of this input stream should therefore always call
  ReleasableInputStream.release() in a finally block to truly release the underlying
  resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal ResettableInputStream]))

(defn ->resettable-input-stream
  "Constructor.

  file - must not be null. Upon successful construction the the file will be opened with an input stream automatically marked at the starting position of the given file. Note the creation of a ResettableInputStream would entail physically opening a file. If the opened file is meant to be closed only (in a finally block) by the very same code block that created it, then it is necessary that the release method must not be called while the execution is made in other stack frames. In such case, as other stack frames may inadvertently or indirectly call the close method of the stream, the creator of the stream would need to explicitly disable the accidental closing via ReleasableInputStream.disableClose(), so that the release method becomes the only way to truly close the opened file. - `java.io.File`

  throws: java.io.IOException"
  (^ResettableInputStream [^java.io.File file]
    (new ResettableInputStream file)))

(defn *new-resettable-input-stream
  "Convenient factory method to construct a new resettable input stream for
   the given file, converting any IOException into SdkClientException
   with the given error message.

   Note the creation of a ResettableInputStream would entail
   physically opening a file. If the opened file is meant to be closed only
   (in a finally block) by the very same code block that created it, then it
   is necessary that the release method must not be called while the
   execution is made in other stack frames.

   In such case, as other stack frames may inadvertently or indirectly call
   the close method of the stream, the creator of the stream would need to
   explicitly disable the accidental closing via
   ReleasableInputStream.disableClose(), so that the release method
   becomes the only way to truly close the opened file.

  file - `java.io.File`
  errmsg - `java.lang.String`

  returns: `com.amazonaws.internal.ResettableInputStream`"
  (^com.amazonaws.internal.ResettableInputStream [^java.io.File file ^java.lang.String errmsg]
    (ResettableInputStream/newResettableInputStream file errmsg))
  (^com.amazonaws.internal.ResettableInputStream [^java.io.File file]
    (ResettableInputStream/newResettableInputStream file)))

(defn mark-supported
  "returns: `boolean`"
  (^Boolean [^ResettableInputStream this]
    (-> this (.markSupported))))

(defn mark
  "Marks the current position in this input stream. A subsequent call to
   the reset method repositions this stream at the last marked
   position so that subsequent reads re-read the same bytes.
   This method works as long as the underlying file has not been closed.

   Note the creation of a ResettableInputStream would entail
   physically opening a file. If the opened file is meant to be closed only
   (in a finally block) by the very same code block that created it, then it
   is necessary that the release method must not be called while the
   execution is made in other stack frames.

   In such case, as other stack frames may inadvertently or indirectly call
   the close method of the stream, the creator of the stream would need to
   explicitly disable the accidental closing via
   ReleasableInputStream.disableClose(), so that the release method
   becomes the only way to truly close the opened file.

  ignored - `int`"
  ([^ResettableInputStream this ^Integer ]
    (-> this (.mark))))

(defn reset
  "Repositions this stream to the position at the time the
   mark method was last called on this input stream.
   This method works as long as the underlying file has not been closed.

   Note the creation of a ResettableInputStream would entail
   physically opening a file. If the opened file is meant to be closed only
   (in a finally block) by the very same code block that created it, then it
   is necessary that the release method must not be called while the
   execution is made in other stack frames.

   In such case, as other stack frames may inadvertently or indirectly call
   the close method of the stream, the creator of the stream would need to
   explicitly disable the accidental closing via
   ReleasableInputStream.disableClose(), so that the release method
   becomes the only way to truly close the opened file.

  throws: java.io.IOException"
  ([^ResettableInputStream this]
    (-> this (.reset))))

(defn available
  "returns: `int`

  throws: java.io.IOException"
  (^Integer [^ResettableInputStream this]
    (-> this (.available))))

(defn read
  "arg-0 - `byte[]`
  arg-1 - `int`
  arg-2 - `int`

  returns: `int`

  throws: java.io.IOException"
  (^Integer [^ResettableInputStream this arg-0 ^Integer arg-1 ^Integer arg-2]
    (-> this (.read arg-0 arg-1 arg-2)))
  (^Integer [^ResettableInputStream this]
    (-> this (.read))))

(defn skip
  "n - `long`

  returns: `long`

  throws: java.io.IOException"
  (^Long [^ResettableInputStream this ^Long n]
    (-> this (.skip n))))

(defn get-file
  "Returns the underlying file, if known; or null if not;

  returns: `java.io.File`"
  (^java.io.File [^ResettableInputStream this]
    (-> this (.getFile))))

