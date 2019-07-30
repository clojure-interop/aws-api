(ns com.amazonaws.services.mediastoredata.AbstractAWSMediaStoreData
  "Abstract implementation of AWSMediaStoreData. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastoredata AbstractAWSMediaStoreData]))

(defn delete-object
  "Description copied from interface: AWSMediaStoreData

  request - `com.amazonaws.services.mediastoredata.model.DeleteObjectRequest`

  returns: Result of the DeleteObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DeleteObjectResult`"
  (^com.amazonaws.services.mediastoredata.model.DeleteObjectResult [^AbstractAWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.DeleteObjectRequest request]
    (-> this (.deleteObject request))))

(defn describe-object
  "Description copied from interface: AWSMediaStoreData

  request - `com.amazonaws.services.mediastoredata.model.DescribeObjectRequest`

  returns: Result of the DescribeObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.DescribeObjectResult`"
  (^com.amazonaws.services.mediastoredata.model.DescribeObjectResult [^AbstractAWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.DescribeObjectRequest request]
    (-> this (.describeObject request))))

(defn get-object
  "Description copied from interface: AWSMediaStoreData

  request - `com.amazonaws.services.mediastoredata.model.GetObjectRequest`

  returns: Result of the GetObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.GetObjectResult`"
  (^com.amazonaws.services.mediastoredata.model.GetObjectResult [^AbstractAWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.GetObjectRequest request]
    (-> this (.getObject request))))

(defn list-items
  "Description copied from interface: AWSMediaStoreData

  request - `com.amazonaws.services.mediastoredata.model.ListItemsRequest`

  returns: Result of the ListItems operation returned by the service. - `com.amazonaws.services.mediastoredata.model.ListItemsResult`"
  (^com.amazonaws.services.mediastoredata.model.ListItemsResult [^AbstractAWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.ListItemsRequest request]
    (-> this (.listItems request))))

(defn put-object
  "Description copied from interface: AWSMediaStoreData

  request - `com.amazonaws.services.mediastoredata.model.PutObjectRequest`

  returns: Result of the PutObject operation returned by the service. - `com.amazonaws.services.mediastoredata.model.PutObjectResult`"
  (^com.amazonaws.services.mediastoredata.model.PutObjectResult [^AbstractAWSMediaStoreData this ^com.amazonaws.services.mediastoredata.model.PutObjectRequest request]
    (-> this (.putObject request))))

(defn shutdown
  "Description copied from interface: AWSMediaStoreData"
  ([^AbstractAWSMediaStoreData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaStoreData

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaStoreData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

