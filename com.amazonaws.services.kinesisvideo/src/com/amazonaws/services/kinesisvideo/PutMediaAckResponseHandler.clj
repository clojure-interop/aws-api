(ns com.amazonaws.services.kinesisvideo.PutMediaAckResponseHandler
  "Response handler interface for receiving AckEvent's asynchronously during a
  AmazonKinesisVideoPutMediaClient.putMedia(PutMediaRequest, PutMediaAckResponseHandler) request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.kinesisvideo PutMediaAckResponseHandler]))

(defn on-ack-event
  "Called when an AckEvent is returned by the service.

  event - Event data. - `com.amazonaws.services.kinesisvideo.model.AckEvent`"
  ([^PutMediaAckResponseHandler this ^com.amazonaws.services.kinesisvideo.model.AckEvent event]
    (-> this (.onAckEvent event))))

