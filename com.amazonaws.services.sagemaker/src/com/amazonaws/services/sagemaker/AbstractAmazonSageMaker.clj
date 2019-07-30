(ns com.amazonaws.services.sagemaker.AbstractAmazonSageMaker
  "Abstract implementation of AmazonSageMaker. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AbstractAmazonSageMaker]))

(defn describe-algorithm
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest`

  returns: Result of the DescribeAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest request]
    (-> this (.describeAlgorithm request))))

(defn describe-compilation-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest`

  returns: Result of the DescribeCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest request]
    (-> this (.describeCompilationJob request))))

(defn list-model-packages
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListModelPackagesRequest`

  returns: Result of the ListModelPackages operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListModelPackagesResult`"
  (^com.amazonaws.services.sagemaker.model.ListModelPackagesResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest request]
    (-> this (.listModelPackages request))))

(defn delete-tags
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteTagsResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteTagsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn add-tags
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.AddTagsRequest`

  returns: Result of the AddTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.AddTagsResult`"
  (^com.amazonaws.services.sagemaker.model.AddTagsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.AddTagsRequest request]
    (-> this (.addTags request))))

(defn update-endpoint-weights-and-capacities
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest`

  returns: Result of the UpdateEndpointWeightsAndCapacities operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest request]
    (-> this (.updateEndpointWeightsAndCapacities request))))

(defn list-workteams
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListWorkteamsRequest`

  returns: Result of the ListWorkteams operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListWorkteamsResult`"
  (^com.amazonaws.services.sagemaker.model.ListWorkteamsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest request]
    (-> this (.listWorkteams request))))

(defn create-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateWorkteamRequest`

  returns: Result of the CreateWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.CreateWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest request]
    (-> this (.createWorkteam request))))

(defn list-endpoints
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListEndpointsRequest`

  returns: Result of the ListEndpoints operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListEndpointsResult`"
  (^com.amazonaws.services.sagemaker.model.ListEndpointsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest request]
    (-> this (.listEndpoints request))))

(defn delete-endpoint-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest`

  returns: Result of the DeleteEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest request]
    (-> this (.deleteEndpointConfig request))))

(defn list-hyper-parameter-tuning-jobs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest`

  returns: Result of the ListHyperParameterTuningJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest request]
    (-> this (.listHyperParameterTuningJobs request))))

(defn list-training-jobs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest`

  returns: Result of the ListTrainingJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTrainingJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTrainingJobsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest request]
    (-> this (.listTrainingJobs request))))

(defn waiters
  "returns: `com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters`"
  (^com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters [^AbstractAmazonSageMaker this]
    (-> this (.waiters))))

(defn delete-notebook-instance-lifecycle-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest`

  returns: Result of the DeleteNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest request]
    (-> this (.deleteNotebookInstanceLifecycleConfig request))))

(defn stop-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest`

  returns: Result of the StopNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest request]
    (-> this (.stopNotebookInstance request))))

(defn list-transform-jobs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListTransformJobsRequest`

  returns: Result of the ListTransformJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTransformJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTransformJobsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest request]
    (-> this (.listTransformJobs request))))

(defn create-compilation-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest`

  returns: Result of the CreateCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateCompilationJobResult`"
  (^com.amazonaws.services.sagemaker.model.CreateCompilationJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest request]
    (-> this (.createCompilationJob request))))

(defn list-training-jobs-for-hyper-parameter-tuning-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest`

  returns: Result of the ListTrainingJobsForHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult`"
  (^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest request]
    (-> this (.listTrainingJobsForHyperParameterTuningJob request))))

(defn delete-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest`

  returns: Result of the DeleteWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest request]
    (-> this (.deleteWorkteam request))))

(defn list-tags
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListTagsRequest`

  returns: Result of the ListTags operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListTagsResult`"
  (^com.amazonaws.services.sagemaker.model.ListTagsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListTagsRequest request]
    (-> this (.listTags request))))

(defn delete-endpoint
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteEndpointResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn update-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest`

  returns: Result of the UpdateNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest request]
    (-> this (.updateNotebookInstance request))))

(defn create-endpoint
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateEndpointRequest`

  returns: Result of the CreateEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.CreateEndpointResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest request]
    (-> this (.createEndpoint request))))

(defn describe-model
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeModelRequest`

  returns: Result of the DescribeModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeModelResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeModelResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest request]
    (-> this (.describeModel request))))

(defn update-endpoint
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateEndpointRequest`

  returns: Result of the UpdateEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateEndpointResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest request]
    (-> this (.updateEndpoint request))))

(defn create-transform-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateTransformJobRequest`

  returns: Result of the CreateTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateTransformJobResult`"
  (^com.amazonaws.services.sagemaker.model.CreateTransformJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest request]
    (-> this (.createTransformJob request))))

(defn delete-algorithm
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest`

  returns: Result of the DeleteAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest request]
    (-> this (.deleteAlgorithm request))))

(defn create-training-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest`

  returns: Result of the CreateTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateTrainingJobResult`"
  (^com.amazonaws.services.sagemaker.model.CreateTrainingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest request]
    (-> this (.createTrainingJob request))))

(defn create-algorithm
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest`

  returns: Result of the CreateAlgorithm operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateAlgorithmResult`"
  (^com.amazonaws.services.sagemaker.model.CreateAlgorithmResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest request]
    (-> this (.createAlgorithm request))))

(defn create-notebook-instance-lifecycle-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest`

  returns: Result of the CreateNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest request]
    (-> this (.createNotebookInstanceLifecycleConfig request))))

(defn describe-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest`

  returns: Result of the DescribeWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest request]
    (-> this (.describeWorkteam request))))

(defn describe-subscribed-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest`

  returns: Result of the DescribeSubscribedWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest request]
    (-> this (.describeSubscribedWorkteam request))))

(defn start-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest`

  returns: Result of the StartNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest request]
    (-> this (.startNotebookInstance request))))

(defn list-algorithms
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest`

  returns: Result of the ListAlgorithms operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListAlgorithmsResult`"
  (^com.amazonaws.services.sagemaker.model.ListAlgorithmsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest request]
    (-> this (.listAlgorithms request))))

(defn delete-model-package
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest`

  returns: Result of the DeleteModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteModelPackageResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest request]
    (-> this (.deleteModelPackage request))))

(defn stop-compilation-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopCompilationJobRequest`

  returns: Result of the StopCompilationJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopCompilationJobResult`"
  (^com.amazonaws.services.sagemaker.model.StopCompilationJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest request]
    (-> this (.stopCompilationJob request))))

(defn render-ui-template
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest`

  returns: Result of the RenderUiTemplate operation returned by the service. - `com.amazonaws.services.sagemaker.model.RenderUiTemplateResult`"
  (^com.amazonaws.services.sagemaker.model.RenderUiTemplateResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest request]
    (-> this (.renderUiTemplate request))))

(defn create-labeling-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest`

  returns: Result of the CreateLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateLabelingJobResult`"
  (^com.amazonaws.services.sagemaker.model.CreateLabelingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest request]
    (-> this (.createLabelingJob request))))

(defn stop-transform-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopTransformJobRequest`

  returns: Result of the StopTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopTransformJobResult`"
  (^com.amazonaws.services.sagemaker.model.StopTransformJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest request]
    (-> this (.stopTransformJob request))))

(defn stop-hyper-parameter-tuning-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest`

  returns: Result of the StopHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult`"
  (^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest request]
    (-> this (.stopHyperParameterTuningJob request))))

(defn describe-code-repository
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest`

  returns: Result of the DescribeCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest request]
    (-> this (.describeCodeRepository request))))

(defn get-search-suggestions
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest`

  returns: Result of the GetSearchSuggestions operation returned by the service. - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult`"
  (^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest request]
    (-> this (.getSearchSuggestions request))))

(defn describe-notebook-instance-lifecycle-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest`

  returns: Result of the DescribeNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest request]
    (-> this (.describeNotebookInstanceLifecycleConfig request))))

(defn create-presigned-notebook-instance-url
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest`

  returns: Result of the CreatePresignedNotebookInstanceUrl operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult`"
  (^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest request]
    (-> this (.createPresignedNotebookInstanceUrl request))))

(defn create-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest`

  returns: Result of the CreateNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest request]
    (-> this (.createNotebookInstance request))))

(defn shutdown
  "Description copied from interface: AmazonSageMaker"
  ([^AbstractAmazonSageMaker this]
    (-> this (.shutdown))))

(defn list-labeling-jobs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest`

  returns: Result of the ListLabelingJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListLabelingJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListLabelingJobsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest request]
    (-> this (.listLabelingJobs request))))

(defn create-endpoint-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest`

  returns: Result of the CreateEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult`"
  (^com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest request]
    (-> this (.createEndpointConfig request))))

(defn create-model-package
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateModelPackageRequest`

  returns: Result of the CreateModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.CreateModelPackageResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest request]
    (-> this (.createModelPackage request))))

(defn create-code-repository
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest`

  returns: Result of the CreateCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest request]
    (-> this (.createCodeRepository request))))

(defn create-hyper-parameter-tuning-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest`

  returns: Result of the CreateHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult`"
  (^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest request]
    (-> this (.createHyperParameterTuningJob request))))

(defn create-model
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.CreateModelRequest`

  returns: Result of the CreateModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.CreateModelResult`"
  (^com.amazonaws.services.sagemaker.model.CreateModelResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.CreateModelRequest request]
    (-> this (.createModel request))))

(defn list-endpoint-configs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest`

  returns: Result of the ListEndpointConfigs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult`"
  (^com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest request]
    (-> this (.listEndpointConfigs request))))

(defn describe-labeling-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest`

  returns: Result of the DescribeLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest request]
    (-> this (.describeLabelingJob request))))

(defn list-notebook-instance-lifecycle-configs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest`

  returns: Result of the ListNotebookInstanceLifecycleConfigs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult`"
  (^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest request]
    (-> this (.listNotebookInstanceLifecycleConfigs request))))

(defn describe-endpoint
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeEndpointRequest`

  returns: Result of the DescribeEndpoint operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeEndpointResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeEndpointResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest request]
    (-> this (.describeEndpoint request))))

(defn update-notebook-instance-lifecycle-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest`

  returns: Result of the UpdateNotebookInstanceLifecycleConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest request]
    (-> this (.updateNotebookInstanceLifecycleConfig request))))

(defn list-labeling-jobs-for-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest`

  returns: Result of the ListLabelingJobsForWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest request]
    (-> this (.listLabelingJobsForWorkteam request))))

(defn delete-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest`

  returns: Result of the DeleteNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest request]
    (-> this (.deleteNotebookInstance request))))

(defn stop-labeling-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopLabelingJobRequest`

  returns: Result of the StopLabelingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopLabelingJobResult`"
  (^com.amazonaws.services.sagemaker.model.StopLabelingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest request]
    (-> this (.stopLabelingJob request))))

(defn update-code-repository
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest`

  returns: Result of the UpdateCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest request]
    (-> this (.updateCodeRepository request))))

(defn describe-transform-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest`

  returns: Result of the DescribeTransformJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeTransformJobResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeTransformJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest request]
    (-> this (.describeTransformJob request))))

(defn list-compilation-jobs
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest`

  returns: Result of the ListCompilationJobs operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListCompilationJobsResult`"
  (^com.amazonaws.services.sagemaker.model.ListCompilationJobsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest request]
    (-> this (.listCompilationJobs request))))

(defn delete-model
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteModelRequest`

  returns: Result of the DeleteModel operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteModelResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteModelResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest request]
    (-> this (.deleteModel request))))

(defn delete-code-repository
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest`

  returns: Result of the DeleteCodeRepository operation returned by the service. - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult`"
  (^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest request]
    (-> this (.deleteCodeRepository request))))

(defn list-code-repositories
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest`

  returns: Result of the ListCodeRepositories operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult`"
  (^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest request]
    (-> this (.listCodeRepositories request))))

(defn describe-model-package
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest`

  returns: Result of the DescribeModelPackage operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeModelPackageResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeModelPackageResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest request]
    (-> this (.describeModelPackage request))))

(defn describe-notebook-instance
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest`

  returns: Result of the DescribeNotebookInstance operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest request]
    (-> this (.describeNotebookInstance request))))

(defn update-workteam
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest`

  returns: Result of the UpdateWorkteam operation returned by the service. - `com.amazonaws.services.sagemaker.model.UpdateWorkteamResult`"
  (^com.amazonaws.services.sagemaker.model.UpdateWorkteamResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest request]
    (-> this (.updateWorkteam request))))

(defn describe-endpoint-config
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest`

  returns: Result of the DescribeEndpointConfig operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest request]
    (-> this (.describeEndpointConfig request))))

(defn describe-hyper-parameter-tuning-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest`

  returns: Result of the DescribeHyperParameterTuningJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest request]
    (-> this (.describeHyperParameterTuningJob request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSageMaker

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSageMaker this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn list-notebook-instances
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest`

  returns: Result of the ListNotebookInstances operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult`"
  (^com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest request]
    (-> this (.listNotebookInstances request))))

(defn search
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.SearchRequest`

  returns: Result of the Search operation returned by the service. - `com.amazonaws.services.sagemaker.model.SearchResult`"
  (^com.amazonaws.services.sagemaker.model.SearchResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.SearchRequest request]
    (-> this (.search request))))

(defn describe-training-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest`

  returns: Result of the DescribeTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult`"
  (^com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest request]
    (-> this (.describeTrainingJob request))))

(defn stop-training-job
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.StopTrainingJobRequest`

  returns: Result of the StopTrainingJob operation returned by the service. - `com.amazonaws.services.sagemaker.model.StopTrainingJobResult`"
  (^com.amazonaws.services.sagemaker.model.StopTrainingJobResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest request]
    (-> this (.stopTrainingJob request))))

(defn list-subscribed-workteams
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest`

  returns: Result of the ListSubscribedWorkteams operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult`"
  (^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest request]
    (-> this (.listSubscribedWorkteams request))))

(defn list-models
  "Description copied from interface: AmazonSageMaker

  request - `com.amazonaws.services.sagemaker.model.ListModelsRequest`

  returns: Result of the ListModels operation returned by the service. - `com.amazonaws.services.sagemaker.model.ListModelsResult`"
  (^com.amazonaws.services.sagemaker.model.ListModelsResult [^AbstractAmazonSageMaker this ^com.amazonaws.services.sagemaker.model.ListModelsRequest request]
    (-> this (.listModels request))))

