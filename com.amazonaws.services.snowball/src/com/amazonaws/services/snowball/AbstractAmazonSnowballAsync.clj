(ns com.amazonaws.services.snowball.AbstractAmazonSnowballAsync
  "Abstract implementation of AmazonSnowballAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AbstractAmazonSnowballAsync]))

(defn describe-job-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.DescribeJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeJobRequest request]
    (-> this (.describeJobAsync request))))

(defn create-cluster-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.CreateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateClusterRequest request]
    (-> this (.createClusterAsync request))))

(defn list-compatible-images-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.ListCompatibleImagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCompatibleImages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListCompatibleImagesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCompatibleImagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest request]
    (-> this (.listCompatibleImagesAsync request))))

(defn list-jobs-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.ListJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListJobsRequest request]
    (-> this (.listJobsAsync request))))

(defn get-snowball-usage-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.GetSnowballUsageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSnowballUsage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetSnowballUsageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSnowballUsageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest request]
    (-> this (.getSnowballUsageAsync request))))

(defn get-job-unlock-code-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobUnlockCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetJobUnlockCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobUnlockCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest request]
    (-> this (.getJobUnlockCodeAsync request))))

(defn describe-addresses-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.DescribeAddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeAddressesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest request]
    (-> this (.describeAddressesAsync request))))

(defn describe-address-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.DescribeAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeAddressResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeAddressRequest request]
    (-> this (.describeAddressAsync request))))

(defn cancel-job-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.CancelJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CancelJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelJobRequest request]
    (-> this (.cancelJobAsync request))))

(defn create-job-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.CreateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateJobRequest request]
    (-> this (.createJobAsync request))))

(defn list-clusters-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.ListClustersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListClustersResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClustersRequest request]
    (-> this (.listClustersAsync request))))

(defn get-job-manifest-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.GetJobManifestRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetJobManifest operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.GetJobManifestResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobManifestRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getJobManifestAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.GetJobManifestRequest request]
    (-> this (.getJobManifestAsync request))))

(defn update-job-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.UpdateJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.UpdateJobResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateJobRequest request]
    (-> this (.updateJobAsync request))))

(defn list-cluster-jobs-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.ListClusterJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListClusterJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.ListClusterJobsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listClusterJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest request]
    (-> this (.listClusterJobsAsync request))))

(defn cancel-cluster-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.CancelClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CancelClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CancelClusterRequest request]
    (-> this (.cancelClusterAsync request))))

(defn describe-cluster-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.DescribeClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.DescribeClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.DescribeClusterRequest request]
    (-> this (.describeClusterAsync request))))

(defn update-cluster-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.UpdateClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.UpdateClusterResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.UpdateClusterRequest request]
    (-> this (.updateClusterAsync request))))

(defn create-address-async
  "Description copied from interface: AmazonSnowballAsync

  request - `com.amazonaws.services.snowball.model.CreateAddressRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.snowball.model.CreateAddressResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSnowballAsync this ^com.amazonaws.services.snowball.model.CreateAddressRequest request]
    (-> this (.createAddressAsync request))))

