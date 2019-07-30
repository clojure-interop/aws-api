(ns com.amazonaws.services.s3.OnFileDelete
  "A service provider interface (SPI) used to notify the event of a file
  deletion."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.s3 OnFileDelete]))

(defn on-file-delete
  "Called upon a file deletion event.

   Implementation of this method should never block.

  event - file deletion event - `com.amazonaws.services.s3.internal.FileDeletionEvent`"
  ([^OnFileDelete this ^com.amazonaws.services.s3.internal.FileDeletionEvent event]
    (-> this (.onFileDelete event))))

