#====create static ip address (if it created then apply it to k8s env)
gcloud-apply-static-ip:
	gcloud compute addresses create  web-static-ip2 --global

gcloud-delete-static-ip:
	gcloud compute addresses delete web-static-ip2 --global

gcloud-show-static-ip:
	gcloud compute addresses describe web-static-ip2 --global