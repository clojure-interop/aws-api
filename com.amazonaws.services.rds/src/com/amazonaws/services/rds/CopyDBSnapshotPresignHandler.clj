(ns com.amazonaws.services.rds.CopyDBSnapshotPresignHandler
  "Handler for pre-signing CopyDBSnapshotRequest."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rds CopyDBSnapshotPresignHandler]))

(defn ->copy-db-snapshot-presign-handler
  "Constructor."
  (^CopyDBSnapshotPresignHandler []
    (new CopyDBSnapshotPresignHandler )))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^CopyDBSnapshotPresignHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

