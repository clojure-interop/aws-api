(ns com.amazonaws.services.snowball.AbstractAmazonSnowball
  "Abstract implementation of AmazonSnowball. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AbstractAmazonSnowball]))

(defn cancel-cluster
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.CancelClusterRequest`

  returns: Result of the CancelCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CancelClusterResult`"
  (^com.amazonaws.services.snowball.model.CancelClusterResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.CancelClusterRequest request]
    (-> this (.cancelCluster request))))

(defn describe-cluster
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeClusterResult`"
  (^com.amazonaws.services.snowball.model.DescribeClusterResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeClusterRequest request]
    (-> this (.describeCluster request))))

(defn set-region
  "Description copied from interface: AmazonSnowball

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSnowball this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-cluster-jobs
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.ListClusterJobsRequest`

  returns: Result of the ListClusterJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListClusterJobsResult`"
  (^com.amazonaws.services.snowball.model.ListClusterJobsResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest request]
    (-> this (.listClusterJobs request))))

(defn describe-job
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeJobResult`"
  (^com.amazonaws.services.snowball.model.DescribeJobResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeJobRequest request]
    (-> this (.describeJob request))))

(defn describe-addresses
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.DescribeAddressesRequest`

  returns: Result of the DescribeAddresses operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressesResult`"
  (^com.amazonaws.services.snowball.model.DescribeAddressesResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest request]
    (-> this (.describeAddresses request))))

(defn update-job
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateJobResult`"
  (^com.amazonaws.services.snowball.model.UpdateJobResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.UpdateJobRequest request]
    (-> this (.updateJob request))))

(defn list-compatible-images
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.ListCompatibleImagesRequest`

  returns: Result of the ListCompatibleImages operation returned by the service. - `com.amazonaws.services.snowball.model.ListCompatibleImagesResult`"
  (^com.amazonaws.services.snowball.model.ListCompatibleImagesResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest request]
    (-> this (.listCompatibleImages request))))

(defn shutdown
  "Description copied from interface: AmazonSnowball"
  ([^AbstractAmazonSnowball this]
    (-> this (.shutdown))))

(defn get-job-unlock-code
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest`

  returns: Result of the GetJobUnlockCode operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobUnlockCodeResult`"
  (^com.amazonaws.services.snowball.model.GetJobUnlockCodeResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest request]
    (-> this (.getJobUnlockCode request))))

(defn set-endpoint
  "Description copied from interface: AmazonSnowball

  endpoint - The endpoint (ex: \"snowball.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"snowball.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSnowball this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.snowball.model.CancelJobResult`"
  (^com.amazonaws.services.snowball.model.CancelJobResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.CancelJobRequest request]
    (-> this (.cancelJob request))))

(defn list-jobs
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListJobsResult`"
  (^com.amazonaws.services.snowball.model.ListJobsResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.ListJobsRequest request]
    (-> this (.listJobs request))))

(defn create-address
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.CreateAddressRequest`

  returns: Result of the CreateAddress operation returned by the service. - `com.amazonaws.services.snowball.model.CreateAddressResult`"
  (^com.amazonaws.services.snowball.model.CreateAddressResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.CreateAddressRequest request]
    (-> this (.createAddress request))))

(defn get-snowball-usage
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.GetSnowballUsageRequest`

  returns: Result of the GetSnowballUsage operation returned by the service. - `com.amazonaws.services.snowball.model.GetSnowballUsageResult`"
  (^com.amazonaws.services.snowball.model.GetSnowballUsageResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest request]
    (-> this (.getSnowballUsage request))))

(defn create-cluster
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CreateClusterResult`"
  (^com.amazonaws.services.snowball.model.CreateClusterResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.CreateClusterRequest request]
    (-> this (.createCluster request))))

(defn update-cluster
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.UpdateClusterRequest`

  returns: Result of the UpdateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateClusterResult`"
  (^com.amazonaws.services.snowball.model.UpdateClusterResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.UpdateClusterRequest request]
    (-> this (.updateCluster request))))

(defn describe-address
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.DescribeAddressRequest`

  returns: Result of the DescribeAddress operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressResult`"
  (^com.amazonaws.services.snowball.model.DescribeAddressResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeAddressRequest request]
    (-> this (.describeAddress request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSnowball

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSnowball this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-job-manifest
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.GetJobManifestRequest`

  returns: Result of the GetJobManifest operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobManifestResult`"
  (^com.amazonaws.services.snowball.model.GetJobManifestResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.GetJobManifestRequest request]
    (-> this (.getJobManifest request))))

(defn create-job
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.snowball.model.CreateJobResult`"
  (^com.amazonaws.services.snowball.model.CreateJobResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.CreateJobRequest request]
    (-> this (.createJob request))))

(defn list-clusters
  "Description copied from interface: AmazonSnowball

  request - `com.amazonaws.services.snowball.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.snowball.model.ListClustersResult`"
  (^com.amazonaws.services.snowball.model.ListClustersResult [^AbstractAmazonSnowball this ^com.amazonaws.services.snowball.model.ListClustersRequest request]
    (-> this (.listClusters request))))

