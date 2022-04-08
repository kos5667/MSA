docker stop api_riot

docker rm -f api_riot

docker rmi api_riot:latest

docker build --tag api_riot:latest .

#dev
docker run -d -p 10130:10130 -e LC_ALL=C.UTF-8 --hostname="msa-test" --name api_riot -e LOGFILE=/NDATA3/platform/logs/api_oldlad/api_oldlad-`hostname`.log -v /NDATA3/platform/logs:/NDATA3/platform/logs -v /NDATA2/apisrc/api_oldlad/config:/config -v /NAS/:/NAS/ -v /tmp:/tmp -v /nas_was_data1:/nas_was_data1 -v /nas_was_data2:/nas_was_data2 -v /NDATA3/cada:/NDATA3/cada -v  /NDATA2/apisrc/api_oldlad/home:/home api_oldlad:latest
