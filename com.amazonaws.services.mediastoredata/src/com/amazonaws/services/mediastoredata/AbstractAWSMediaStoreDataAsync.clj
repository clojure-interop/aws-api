(ns com.amazonaws.services.mediastoredata.AbstractAWSMediaStoreDataAsync
  "Abstract implementation of AWSMediaStoreDataAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AbstractAWSMediaStoreDataAsync]))

(defn delete-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DeleteObjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request]
    (-> this (.deleteObjectAsync request))))

(defn describe-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DescribeObjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request]
    (-> this (.describeObjectAsync request))))

(defn get-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.GetObjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request]
    (-> this (.getObjectAsync request))))

(defn list-items-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.ListItemsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listItemsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request]
    (-> this (.listItemsAsync request))))

(defn put-object-async
  "Description copied from interface: AWSMediaStoreDataAsync

  request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.PutObjectResult>`"
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putObjectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request]
    (-> this (.putObjectAsync request))))

