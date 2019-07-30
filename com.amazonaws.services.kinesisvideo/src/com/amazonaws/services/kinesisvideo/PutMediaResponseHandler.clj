(ns com.amazonaws.services.kinesisvideo.PutMediaResponseHandler
  "Base handler interface for PutMediaAckResponseHandler."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo PutMediaResponseHandler]))

(defn on-failure
  "Called when the AmazonKinesisVideoPutMedia.putMedia(PutMediaRequest, PutMediaAckResponseHandler) call is unsuccessful
   or aborted abnormally.

   Note that only one of onFailure(Throwable) and onComplete() will be called

  t - Cause of failure. - `java.lang.Throwable`"
  ([^PutMediaResponseHandler this ^java.lang.Throwable t]
    (-> this (.onFailure t))))

(defn on-complete
  "Called when all ack event data has been received for the stream.

   Note that only one of onFailure(Throwable) and onComplete() will be called"
  ([^PutMediaResponseHandler this]
    (-> this (.onComplete))))

