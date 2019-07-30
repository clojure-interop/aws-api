(ns com.amazonaws.services.snowball.AmazonSnowball
  "Interface for accessing Amazon Snowball.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSnowball instead.



  AWS Snowball is a petabyte-scale data transport solution that uses secure devices to transfer large amounts of data
  between your on-premises data centers and Amazon Simple Storage Service (Amazon S3). The commands described here
  provide access to the same functionality that is available in the AWS Snowball Management Console, which enables you
  to create and manage jobs for Snowball and Snowball Edge devices. To transfer data locally with a device, you'll need
  to use the Snowball client or the Amazon S3 API adapter for Snowball."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.snowball AmazonSnowball]))

(defn cancel-cluster
  "Cancels a cluster job. You can only cancel a cluster job while it's in the AwaitingQuorum status.
   You'll have at least an hour after creating a cluster job to cancel it.

  cancel-cluster-request - `com.amazonaws.services.snowball.model.CancelClusterRequest`

  returns: Result of the CancelCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CancelClusterResult`

  throws: com.amazonaws.services.snowball.model.KMSRequestFailedException - The provided AWS Key Management Service key lacks the permissions to perform the specified CreateJob or UpdateJob action."
  (^com.amazonaws.services.snowball.model.CancelClusterResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.CancelClusterRequest cancel-cluster-request]
    (-> this (.cancelCluster cancel-cluster-request))))

(defn describe-cluster
  "Returns information about a specific cluster including shipping information, cluster status, and other important
   metadata.

  describe-cluster-request - `com.amazonaws.services.snowball.model.DescribeClusterRequest`

  returns: Result of the DescribeCluster operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeClusterResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeClusterRequest describe-cluster-request]
    (-> this (.describeCluster describe-cluster-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonSnowball this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-cluster-jobs
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object is for a job in the specified cluster and contains a job's state, a job's ID, and other information.

  list-cluster-jobs-request - `com.amazonaws.services.snowball.model.ListClusterJobsRequest`

  returns: Result of the ListClusterJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListClusterJobsResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.ListClusterJobsResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.ListClusterJobsRequest list-cluster-jobs-request]
    (-> this (.listClusterJobs list-cluster-jobs-request))))

(defn describe-job
  "Returns information about a specific job including shipping information, job status, and other important
   metadata.

  describe-job-request - `com.amazonaws.services.snowball.model.DescribeJobRequest`

  returns: Result of the DescribeJob operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeJobResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeJobRequest describe-job-request]
    (-> this (.describeJob describe-job-request))))

(defn describe-addresses
  "Returns a specified number of ADDRESS objects. Calling this API in one of the US regions will return
   addresses from the list of all addresses associated with this account in all US regions.

  describe-addresses-request - `com.amazonaws.services.snowball.model.DescribeAddressesRequest`

  returns: Result of the DescribeAddresses operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressesResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeAddressesResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeAddressesRequest describe-addresses-request]
    (-> this (.describeAddresses describe-addresses-request))))

(defn update-job
  "While a job's JobState value is New, you can update some of the information associated
   with a job. Once the job changes to a different job state, usually within 60 minutes of the job being created,
   this action is no longer available.

  update-job-request - `com.amazonaws.services.snowball.model.UpdateJobRequest`

  returns: Result of the UpdateJob operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.UpdateJobResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.UpdateJobRequest update-job-request]
    (-> this (.updateJob update-job-request))))

(defn list-compatible-images
  "This action returns a list of the different Amazon EC2 Amazon Machine Images (AMIs) that are owned by your AWS
   account that would be supported for use on EDGE, EDGE_C, and EDGE_CG
   devices. For more information on compatible AMIs, see Using Amazon EC2 Compute
   Instances in the AWS Snowball Developer Guide.

  list-compatible-images-request - `com.amazonaws.services.snowball.model.ListCompatibleImagesRequest`

  returns: Result of the ListCompatibleImages operation returned by the service. - `com.amazonaws.services.snowball.model.ListCompatibleImagesResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListCompatibleImagesResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.ListCompatibleImagesRequest list-compatible-images-request]
    (-> this (.listCompatibleImages list-compatible-images-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonSnowball this]
    (-> this (.shutdown))))

(defn get-job-unlock-code
  "Returns the UnlockCode code value for the specified job. A particular UnlockCode value
   can be accessed for up to 90 days after the associated job has been created.


   The UnlockCode value is a 29-character code with 25 alphanumeric characters and 4 hyphens. This code
   is used to decrypt the manifest file when it is passed along with the manifest to the Snowball through the
   Snowball client when the client is started for the first time.


   As a best practice, we recommend that you don't save a copy of the UnlockCode in the same location
   as the manifest file for that job. Saving these separately helps prevent unauthorized parties from gaining access
   to the Snowball associated with that job.

  get-job-unlock-code-request - `com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest`

  returns: Result of the GetJobUnlockCode operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobUnlockCodeResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.GetJobUnlockCodeResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.GetJobUnlockCodeRequest get-job-unlock-code-request]
    (-> this (.getJobUnlockCode get-job-unlock-code-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"snowball.us-east-1.amazonaws.com/\") or a full URL, including the protocol (ex: \"snowball.us-east-1.amazonaws.com/\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonSnowball this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn cancel-job
  "Cancels the specified job. You can only cancel a job before its JobState value changes to
   PreparingAppliance. Requesting the ListJobs or DescribeJob action returns
   a job's JobState as part of the response element data returned.

  cancel-job-request - `com.amazonaws.services.snowball.model.CancelJobRequest`

  returns: Result of the CancelJob operation returned by the service. - `com.amazonaws.services.snowball.model.CancelJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CancelJobResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.CancelJobRequest cancel-job-request]
    (-> this (.cancelJob cancel-job-request))))

(defn list-jobs
  "Returns an array of JobListEntry objects of the specified length. Each JobListEntry
   object contains a job's state, a job's ID, and a value that indicates whether the job is a job part, in the case
   of export jobs. Calling this API action in one of the US regions will return jobs from the list of all jobs
   associated with this account in all US regions.

  list-jobs-request - `com.amazonaws.services.snowball.model.ListJobsRequest`

  returns: Result of the ListJobs operation returned by the service. - `com.amazonaws.services.snowball.model.ListJobsResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListJobsResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.ListJobsRequest list-jobs-request]
    (-> this (.listJobs list-jobs-request))))

(defn create-address
  "Creates an address for a Snowball to be shipped to. In most regions, addresses are validated at the time of
   creation. The address you provide must be located within the serviceable area of your region. If the address is
   invalid or unsupported, then an exception is thrown.

  create-address-request - `com.amazonaws.services.snowball.model.CreateAddressRequest`

  returns: Result of the CreateAddress operation returned by the service. - `com.amazonaws.services.snowball.model.CreateAddressResult`

  throws: com.amazonaws.services.snowball.model.InvalidAddressException - The address provided was invalid. Check the address with your region's carrier, and try again."
  (^com.amazonaws.services.snowball.model.CreateAddressResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.CreateAddressRequest create-address-request]
    (-> this (.createAddress create-address-request))))

(defn get-snowball-usage
  "Returns information about the Snowball service limit for your account, and also the number of Snowballs your
   account has in use.


   The default service limit for the number of Snowballs that you can have at one time is 1. If you want to increase
   your service limit, contact AWS Support.

  get-snowball-usage-request - `com.amazonaws.services.snowball.model.GetSnowballUsageRequest`

  returns: Result of the GetSnowballUsage operation returned by the service. - `com.amazonaws.services.snowball.model.GetSnowballUsageResult`"
  (^com.amazonaws.services.snowball.model.GetSnowballUsageResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.GetSnowballUsageRequest get-snowball-usage-request]
    (-> this (.getSnowballUsage get-snowball-usage-request))))

(defn create-cluster
  "Creates an empty cluster. Each cluster supports five nodes. You use the CreateJob action separately to
   create the jobs for each of these nodes. The cluster does not ship until these five node jobs have been created.

  create-cluster-request - `com.amazonaws.services.snowball.model.CreateClusterRequest`

  returns: Result of the CreateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.CreateClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CreateClusterResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.CreateClusterRequest create-cluster-request]
    (-> this (.createCluster create-cluster-request))))

(defn update-cluster
  "While a cluster's ClusterState value is in the AwaitingQuorum state, you can update
   some of the information associated with a cluster. Once the cluster changes to a different job state, usually 60
   minutes after the cluster being created, this action is no longer available.

  update-cluster-request - `com.amazonaws.services.snowball.model.UpdateClusterRequest`

  returns: Result of the UpdateCluster operation returned by the service. - `com.amazonaws.services.snowball.model.UpdateClusterResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.UpdateClusterResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.UpdateClusterRequest update-cluster-request]
    (-> this (.updateCluster update-cluster-request))))

(defn describe-address
  "Takes an AddressId and returns specific details about that address in the form of an
   Address object.

  describe-address-request - `com.amazonaws.services.snowball.model.DescribeAddressRequest`

  returns: Result of the DescribeAddress operation returned by the service. - `com.amazonaws.services.snowball.model.DescribeAddressResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.DescribeAddressResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.DescribeAddressRequest describe-address-request]
    (-> this (.describeAddress describe-address-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSnowball this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-job-manifest
  "Returns a link to an Amazon S3 presigned URL for the manifest file associated with the specified
   JobId value. You can access the manifest file for up to 60 minutes after this request has been made.
   To access the manifest file after 60 minutes have passed, you'll have to make another call to the
   GetJobManifest action.


   The manifest is an encrypted file that you can download after your job enters the WithCustomer
   status. The manifest is decrypted by using the UnlockCode code value, when you pass both values to
   the Snowball through the Snowball client when the client is started for the first time.


   As a best practice, we recommend that you don't save a copy of an UnlockCode value in the same
   location as the manifest file for that job. Saving these separately helps prevent unauthorized parties from
   gaining access to the Snowball associated with that job.


   The credentials of a given job, including its manifest file and unlock code, expire 90 days after the job is
   created.

  get-job-manifest-request - `com.amazonaws.services.snowball.model.GetJobManifestRequest`

  returns: Result of the GetJobManifest operation returned by the service. - `com.amazonaws.services.snowball.model.GetJobManifestResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.GetJobManifestResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.GetJobManifestRequest get-job-manifest-request]
    (-> this (.getJobManifest get-job-manifest-request))))

(defn create-job
  "Creates a job to the other job attributes are inherited from the cluster.

  create-job-request - `com.amazonaws.services.snowball.model.CreateJobRequest`

  returns: Result of the CreateJob operation returned by the service. - `com.amazonaws.services.snowball.model.CreateJobResult`

  throws: com.amazonaws.services.snowball.model.InvalidResourceException - The specified resource can't be found. Check the information you provided in your last request, and try again."
  (^com.amazonaws.services.snowball.model.CreateJobResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.CreateJobRequest create-job-request]
    (-> this (.createJob create-job-request))))

(defn list-clusters
  "Returns an array of ClusterListEntry objects of the specified length. Each
   ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status
   information.

  list-clusters-request - `com.amazonaws.services.snowball.model.ListClustersRequest`

  returns: Result of the ListClusters operation returned by the service. - `com.amazonaws.services.snowball.model.ListClustersResult`

  throws: com.amazonaws.services.snowball.model.InvalidNextTokenException - The NextToken string was altered unexpectedly, and the operation has stopped. Run the operation without changing the NextToken string, and try again."
  (^com.amazonaws.services.snowball.model.ListClustersResult [^AmazonSnowball this ^com.amazonaws.services.snowball.model.ListClustersRequest list-clusters-request]
    (-> this (.listClusters list-clusters-request))))

