(ns com.amazonaws.services.mediastoredata.AWSMediaStoreDataAsync
  "Interface for accessing MediaStore Data asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSMediaStoreDataAsync instead.



  An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
  fundamental entities that are stored in AWS Elemental MediaStore."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AWSMediaStoreDataAsync]))

(defn delete-object-async
  "Deletes an object at the specified path.

  delete-object-request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DeleteObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest delete-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteObjectAsync delete-object-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest delete-object-request]
    (-> this (.deleteObjectAsync delete-object-request))))

(defn describe-object-async
  "Gets the headers for an object at the specified path.

  describe-object-request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.DescribeObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest describe-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeObjectAsync describe-object-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest describe-object-request]
    (-> this (.describeObjectAsync describe-object-request))))

(defn get-object-async
  "Downloads the object at the specified path. If the object’s upload availability is set to streaming,
   AWS Elemental MediaStore downloads the object even if it’s still uploading the object.

  get-object-request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.GetObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest get-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getObjectAsync get-object-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest get-object-request]
    (-> this (.getObjectAsync get-object-request))))

(defn list-items-async
  "Provides a list of metadata entries about folders and objects in the specified folder.

  list-items-request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListItems operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.ListItemsResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest list-items-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listItemsAsync list-items-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest list-items-request]
    (-> this (.listItemsAsync list-items-request))))

(defn put-object-async
  "Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and
   10 MB for streaming upload availability.

  put-object-request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutObject operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.mediastoredata.model.PutObjectResult>`"
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest put-object-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putObjectAsync put-object-request async-handler)))
  (^java.util.concurrent.Future [^AWSMediaStoreDataAsync this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest put-object-request]
    (-> this (.putObjectAsync put-object-request))))

